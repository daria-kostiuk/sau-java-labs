package lb3.controllers;


import lb3.models.Department;
import lb3.models.Faculty;
import lb3.models.Human;

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
