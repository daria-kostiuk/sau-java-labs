package lb3;

import lb3.controllers.*;
import lb3.enums.Sex;
import lb3.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Run {
    public static University createTypicalUniversity() {
        Human firstHuman = new HumanCreator().createHuman("Shevchenko", "Taras", "Grigorovich", Sex.MALE);
        Human secondHuman = new HumanCreator().createHuman("Boyko", "Grigoriy", "Oleksiovich", Sex.MALE);
        Human thirdHuman = new HumanCreator().createHuman("Kostenko", "Maria", "Viktorivna", Sex.FEMALE);

        Student firstStudent = new StudentCreator().createStudent(firstHuman);
        Student secondStudent = new StudentCreator().createStudent(secondHuman);
        Student thirdStudent = new StudentCreator().createStudent(thirdHuman);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(firstStudent, secondStudent, thirdStudent));
        Group group = new GroupCreator().createGroup("124-19-2", firstStudent, students);

        ArrayList<Group> departmentGroups = new ArrayList<>(Collections.singletonList(group));
        Human departmentChief = new HumanCreator().createHuman("Grigorovich", "Olena", "Vasylivna", Sex.FEMALE);
        Department department = new DepartmentCreator().createDepartment("System analysis", departmentChief, departmentGroups);

        ArrayList<Department> facultyDepartments = new ArrayList<>(Collections.singletonList(department));
        Human facultyChief = new HumanCreator().createHuman("Simonenko", "Igor", "Mykolaiovich", Sex.MALE);
        Faculty faculty = new FacultyCreator().createFaculty("FIT", facultyChief, facultyDepartments);

        ArrayList<Faculty> universityFaculties = new ArrayList<>(Collections.singletonList(faculty));
        Human universityChief = new HumanCreator().createHuman("Zavgorodniy", "Artem", "Olegovych", Sex.MALE);

        return new UniversityCreator().createUniversity("NTU DP", universityChief, universityFaculties);
    }

    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university.toString());
    }
}