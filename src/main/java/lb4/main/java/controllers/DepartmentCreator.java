package lb4.main.java.controllers;

import lb4.main.java.models.Department;
import lb4.main.java.models.Group;
import lb4.main.java.models.Human;

import java.util.ArrayList;

public class DepartmentCreator {
    public Department createDepartment(String name, Human chief, ArrayList<Group> groups) {
        Department department = new Department();

        department.setGroups(groups);
        department.setChief(chief);
        department.setName(name);

        return department;
    }
}
