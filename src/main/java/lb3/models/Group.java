package lb3.models;

import java.util.ArrayList;

public class Group {
    private String name;
    private Human chief;
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public Human getChief() {
        return chief;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChief(Human chief) {
        this.chief = chief;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String toString() {
        return "Group: {name: " + getName() + ", chief:" + getChief() +
                ", \nstudents: " + getStudents() + "}";
    }
}
