package lb4.main.java.controllers;

import lb4.main.java.models.Group;
import lb4.main.java.models.Human;
import lb4.main.java.models.Student;

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
