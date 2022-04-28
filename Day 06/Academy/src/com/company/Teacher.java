package com.company;

public class Teacher extends Employee{

    private String area;

    public Teacher(String firstName, String lastName, String id, String maritalStatus, String year, int officeNum, String area) {
        super(firstName, lastName, id, maritalStatus, year, officeNum);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nArea: " + area;
    }
}
