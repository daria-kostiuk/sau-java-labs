package lb4.main.java.models;

import java.util.ArrayList;
import java.util.Objects;

public class Faculty {
    private String name;
    private Human chief;
    private ArrayList<Department> departments;

    public ArrayList<Department> getDepartments() {
        return departments;
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

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public String toString() {
        return "{name: " + getName() + ", chief: " + getChief() + "\ndepartments:" + getDepartments() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) && Objects.equals(chief, faculty.chief);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chief, departments);
    }
}
