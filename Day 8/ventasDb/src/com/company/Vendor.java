package com.company;

public class Vendor extends Person{

    private double salary;

    public Vendor(String firstName, String lastName, int dni, String adress, double salary) {
        super(firstName, lastName, dni, adress);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nVendor{" +
                "salary=" + salary +
                '}';
    }
}
