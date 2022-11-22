package lb3.controllers;

import lb3.models.Department;
import lb3.models.Group;
import lb3.models.Human;

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
