package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private String id;
    private String maritalStatus;

    public Person(String firstName, String lastName, String id, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.maritalStatus = maritalStatus;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    @Override
    public String toString() {
        return  firstName + " " + lastName + " Id:" + id + " " + maritalStatus;
    }
}
