package lb4.main.java.controllers;

import lb4.main.java.models.Department;
import lb4.main.java.models.Faculty;
import lb4.main.java.models.Human;

import java.util.ArrayList;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human chief, ArrayList<Department> departments) {
        Faculty faculty = new Faculty();

        faculty.setChief(chief);
        faculty.setName(name);
        faculty.setDepartments(departments);

        return faculty;
    }
}
