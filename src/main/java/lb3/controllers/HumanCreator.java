package lb3.controllers;


import lb3.enums.Sex;
import lb3.models.Human;

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
