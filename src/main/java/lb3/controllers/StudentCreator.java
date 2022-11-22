package lb3.controllers;

import lb3.models.Human;
import lb3.models.Student;

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
