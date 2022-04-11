package com.company;

public class Student extends Person{
    private int yearCourse;

    public Student(String firstName, String lastName, String id, String maritalStatus, int yearCourse) {
        super(firstName, lastName, id, maritalStatus);
        this.yearCourse = yearCourse;
    }

    public int getYearCourse() {
        return yearCourse;
    }

    public void setYearCourse(int yearCourse) {
        this.yearCourse = yearCourse;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nYear Course: " + yearCourse;
    }
}
