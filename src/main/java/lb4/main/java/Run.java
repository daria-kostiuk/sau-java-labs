package lb4.main.java;

import lb4.main.java.controllers.UniversityCreator;
import lb4.main.java.models.University;

public class Run {
    public static void main(String[] args) {
        University university = new UniversityCreator().createTypicalUniversity();
        System.out.println(university.toString());
    }
}