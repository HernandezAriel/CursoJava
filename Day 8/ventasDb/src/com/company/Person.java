package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int dni;
    private String adress;

    public Person(String firstName, String lastName, int dni, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni=" + dni +
                ", adress='" + adress + '\'' +
                '}';
    }
}
