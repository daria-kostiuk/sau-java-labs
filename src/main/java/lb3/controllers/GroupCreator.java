package lb3.controllers;


import lb3.models.Group;
import lb3.models.Human;
import lb3.models.Student;

import java.util.ArrayList;

public class GroupCreator {
    public Group createGroup(String name, Human chief, ArrayList<Student> students) {
        Group group = new Group();

        group.setChief(chief);
        group.setName(name);
        group.setStudents(students);

        return group;
    }
}
