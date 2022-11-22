package lb2;
import java.io.InputStream;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Run
{
    static int[][] getMatrix(InputStream is, int n, int m)
    {
        var a = new int[m][];
        Scanner scanner = new Scanner(System.in);
        IntStream.range(0, m).forEach(i -> {
            a[i] = new int[n];
            IntStream.range(0, n).forEach(j -> a[i][j] = scanner.nextInt());
        });
        return a;
    }
    private static int maxValue(int[][] a)
    {
        int max = a[0][0];
        for (int i = 0;i < a.length;i++) {
            for (int j = 0;j < a[i].length;j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
    private static int minValue(int[][] a)
    {
        int min = a[0][0];
        for (int i = 0;i < a.length;i++) {
            for (int j = 0;j < a[i].length;j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        return min;
    }
    private static double sumValue(int[][] a)
    {
        double sum = 0;
        for (int i = 0;i < a.length;i++) {
            for (int j = 0;j < a[i].length;j++) {
                sum+=a[i][j];
            }
        }
        return sum;
    }
    private static double averageValue(int[][] a)
    {
        double sum = 0;
        double average = 0;
        int k = 0;
        for (int i = 0;i < a.length;i++) {
            for (int j = 0;j < a[i].length;j++) {
                sum+=a[i][j];
                k++;
                average = sum/k;
            }
        }
        return average;
    }
    private static double geomValue(int[][] a)
    {
        double compos = 1;
        double k = 0;
        for (int i = 0;i < a.length;i++) {
            for (int j = 0;j < a[i].length;j++) {
                compos = compos * a[i][j];
                k++;
            }
        }
        double geom = Math.pow(compos, 1/k);
        if (compos < 0 & k%2 == 0) {
            System.out.println("Geometric mean is not defined!");
        }
        return geom;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rangeA = -10;
        int rangeB = 10;

        int n;
        while (true) {
            System.out.print("Enter the number of lines (n): ");
            n = in.nextInt();
            if (n <= 0 | n > 20) {
                System.out.println("Incorrect! Enter the number of lines from 1 to 20.");
            }
            else { break; }
        }

        int m;
        while (true) {
            System.out.print("Enter the number of columns (m): ");
            m = in.nextInt();
            if (m <= 0 | m > 20) {
                System.out.println("Incorrect! Enter the number of columns from 1 to 20.");
            }
            else { break; }
        }

       int method;
        while (true) {
            System.out.print("Select fill/random (0/1): ");
            method = in.nextInt();
            if (method < 0 | method > 1) {
                System.out.println("Incorrect! Enter 0 or 1.");
            }
            else { break; }
        }

        System.out.println("\nArray:");

        int[][] a = new int[n][m];
        if (method == 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = (int) (Math.random() * (rangeB - rangeA)) + rangeA;
                }
            }
            for (int i = 0; i < a.length; i++, System.out.println()) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println("\nMin: " + minValue(a));
            System.out.println("Max: " + maxValue(a));
            System.out.println("Sum: " + sumValue(a));
            System.out.println("Average: " + Math.ceil(averageValue(a) * 1000) / 1000);
            System.out.println("Geometric mean: " + Math.ceil(geomValue(a) * 1000) / 1000);
       }
       else {
            var A= getMatrix(System.in, n, m);
            Arrays.stream(A).forEach(l -> System.out.println(Arrays.toString(l)));
            System.out.println("\nMin: " + minValue(A));
            System.out.println("Max: " + maxValue(A));
            System.out.println("Sum: " + sumValue(A));
            System.out.println("Average: " + Math.ceil(averageValue(A) * 1000) / 1000);
            System.out.println("Geometric mean: " + Math.ceil(geomValue(A) * 1000) / 1000);
       }




    }
}
