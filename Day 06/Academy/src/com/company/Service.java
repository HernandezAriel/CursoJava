package com.company;

public class Service extends Employee{
    private String section;

    public Service(String firstName, String lastName, String id, String maritalStatus, String year, int officeNum, String section) {
        super(firstName, lastName, id, maritalStatus, year, officeNum);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nsection: " + section;
    }
}
