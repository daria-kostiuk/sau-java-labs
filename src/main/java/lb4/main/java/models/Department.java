package lb4.main.java.models;

import java.util.ArrayList;
import java.util.Objects;

public class Department {
    private String name;
    private Human chief;
    private ArrayList<Group> groups;

    public ArrayList<Group> getGroups() {
        return groups;
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

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public String toString() {
        return "Department: {name: " + getName() + ", chief:" + getChief() + ", \ngroups:" + getGroups() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Department department = (Department) o;
        return Objects.equals(name, department.name) && Objects.equals(chief, department.chief);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chief, groups);
    }
}
