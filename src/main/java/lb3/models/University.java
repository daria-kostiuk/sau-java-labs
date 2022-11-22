package lb3.models;

import lb3.controllers.StudentCreator;

import java.util.ArrayList;

public class University extends StudentCreator {
    private String name;
    private Human chief;
    private ArrayList<Faculty> faculties;

    public ArrayList<Faculty> getFaculties() {
        return faculties;
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

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String toString() {
        return "\nUniversity: {\nname: " + getName() + ", chief:" + getChief() +
                ", \nfaculties:" + getFaculties() + "\n}";
    }
}
