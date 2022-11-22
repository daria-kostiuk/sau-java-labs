package lb3.controllers;

import lb3.models.Faculty;
import lb3.models.Human;
import lb3.models.University;

import java.util.ArrayList;

public class UniversityCreator {
    public University createUniversity(String name, Human chief, ArrayList<Faculty> faculties) {
        University university = new University();

        university.setName(name);
        university.setChief(chief);
        university.setFaculties(faculties);

        return university;
    }
}
