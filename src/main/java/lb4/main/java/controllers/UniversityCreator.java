package lb4.main.java.controllers;

import lb4.main.java.enums.Sex;
import lb4.main.java.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniversityCreator {
    public University createUniversity(String name, Human chief, ArrayList<Faculty> faculties) {
        University university = new University();

        university.setName(name);
        university.setChief(chief);
        university.setFaculties(faculties);

        return university;
    }

    public University createTypicalUniversity() {
        Student firstStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Shevchenk", "Taras", "Grigorovich", Sex.MALE));
        Student secondStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Dmytrenk", "Ivan", "Ivanovich", Sex.MALE));
        Student thirdStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Vasiliv", "Viktor", "Viktorovich", Sex.MALE));
        Student fourthStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Onufriiv", "Taras", "Grigorovich", Sex.MALE));

        Group firstGroup = new GroupCreator().createGroup("124-19-1", firstStudent, new ArrayList<>(Arrays.asList(firstStudent, secondStudent)));
        Group secondGroup = new GroupCreator().createGroup("124-19-2", thirdStudent, new ArrayList<>(Arrays.asList(thirdStudent, fourthStudent)));

        Student fifthStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Melnik", "Mykola", "Sergiovich", Sex.MALE));
        Student sixthStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Slyar", "Marina", "Oleksandrivna", Sex.FEMALE));
        Student seventhStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Malyar", "Olena", "Grigorivna", Sex.FEMALE));
        Student eightStudent = new StudentCreator().createStudent(new HumanCreator().createHuman("Paliy", "Andriy", "Andriyovich", Sex.MALE));

        Group fourthGroup = new GroupCreator().createGroup("124-19-3", fifthStudent, new ArrayList<>(Arrays.asList(fifthStudent, sixthStudent)));
        Group fifthGroup = new GroupCreator().createGroup("124-19-4", seventhStudent, new ArrayList<>(Arrays.asList(seventhStudent, eightStudent)));

        ArrayList<Group> firstDepartmentGroups = new ArrayList<>(Arrays.asList(firstGroup, secondGroup));

        Human firstDepartmentChief = new HumanCreator().createHuman("Grigorovich", "Olena", "Vasylivna", Sex.FEMALE);
        Department firstDepartment = new DepartmentCreator().createDepartment("System analysis", firstDepartmentChief, firstDepartmentGroups);

        ArrayList<Group> secondDepartmentGroups = new ArrayList<>(Arrays.asList(fourthGroup, fifthGroup));

        Human secondDepartmentChief = new HumanCreator().createHuman("Grinchenko", "Oleg", "Mykolayovich", Sex.MALE);
        Department secondDepartment = new DepartmentCreator().createDepartment("System analysis", secondDepartmentChief, secondDepartmentGroups);

        ArrayList<Department> facultyDepartments = new ArrayList<>(Arrays.asList(firstDepartment, secondDepartment));

        Human facultyChief = new HumanCreator().createHuman("Simonenko", "Igor", "Mykolaiovich", Sex.MALE);
        Faculty faculty = new FacultyCreator().createFaculty("FIT", facultyChief, facultyDepartments);

        ArrayList<Faculty> universityFaculties = new ArrayList<>(Collections.singletonList(faculty));
        Human universityChief = new HumanCreator().createHuman("Zavgorodniy", "Artem", "Olegovych", Sex.MALE);

        return new UniversityCreator().createUniversity("NTU DP", universityChief, universityFaculties);
    }
}
