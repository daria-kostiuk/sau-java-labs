package lb3.models;

import java.util.ArrayList;

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
}
