package com.company;

public class Employee extends Person{
    private String year;
    private int officeNum;

    public Employee(String firstName, String lastName, String id, String maritalStatus, String year, int officeNum) {
        super(firstName, lastName, id, maritalStatus);
        this.year = year;
        this.officeNum = officeNum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(int officeNum) {
        this.officeNum = officeNum;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nYear of incorporation: "+
        year + " NumOffice: " + officeNum;
    }
}
