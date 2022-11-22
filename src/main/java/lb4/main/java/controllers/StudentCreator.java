package lb4.main.java.controllers;

import lb4.main.java.models.Human;
import lb4.main.java.models.Student;

public  class StudentCreator {
    public Student createStudent(Human human) {
        Student student = new Student();

        student.setFirstName(human.getFirstName());
        student.setLastName(human.getLastName());
        student.setPatronymicName(human.getPatronymicName());
        student.setSex(human.getSex());

        return student;
    }
}
