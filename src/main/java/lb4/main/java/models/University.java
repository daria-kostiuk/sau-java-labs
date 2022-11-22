package lb4.main.java.models;

import lb4.main.java.controllers.StudentCreator;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        University university = (University) o;
        return Objects.equals(name, university.name)
                && Objects.equals(chief, university.chief)
                && Objects.equals(faculties, university.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chief, faculties);
    }
}
