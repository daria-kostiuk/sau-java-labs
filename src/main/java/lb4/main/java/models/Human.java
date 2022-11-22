package lb4.main.java.models;


import lb4.main.java.enums.Sex;

import java.util.Objects;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private Sex sex;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public Sex getSex() {
        return sex;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String toString() {
        return "{firstName: " + getFirstName() + ", lastName:" + getLastName() +
                ", patronymicName: " + getPatronymicName() + ", sex:" + getSex() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName)
                && Objects.equals(lastName, human.lastName)
                && Objects.equals(patronymicName, human.patronymicName)
                && Objects.equals(sex, human.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymicName, sex);
    }
}
