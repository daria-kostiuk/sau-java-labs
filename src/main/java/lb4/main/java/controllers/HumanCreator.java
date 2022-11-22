package lb4.main.java.controllers;


import lb4.main.java.enums.Sex;
import lb4.main.java.models.Human;

public class HumanCreator {
    public Human createHuman(String lastName, String firstName, String patronymicName, Sex sex) {
        Human human = new Human();

        human.setPatronymicName(patronymicName);
        human.setFirstName(firstName);
        human.setLastName(lastName);
        human.setSex(sex);
        return human;
    }
}
