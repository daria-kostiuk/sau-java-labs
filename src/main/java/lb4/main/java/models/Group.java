package lb4.main.java.models;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(chief, group.chief);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chief, students);
    }
}
