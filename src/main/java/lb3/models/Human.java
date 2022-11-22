package lb3.models;


import lb3.enums.Sex;

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
}
