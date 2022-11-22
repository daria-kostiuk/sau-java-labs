package lb3.models;

import java.util.ArrayList;

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
}
