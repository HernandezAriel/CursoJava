package com.company;

import javax.imageio.stream.ImageOutputStream;

public class Vendor extends Person{

    private static int vendorId;
    private int idVendor;
    private double salary;

    public Vendor(String firstName, String lastName, String dni, String adress, int year, int month, int day, double salary) {
        super(firstName, lastName, dni, adress, day, month, year);
        vendorId++;
        this.idVendor = vendorId;
        this.salary = salary;
    }

    public static int getVendorId() {
        return vendorId;
    }

    public static void setVendorId(int vendorId) {
        Vendor.vendorId = vendorId;
    }

    public int getIdVendor() {
        return idVendor;
    }

    public void setIdVendor(int idVendor) {
        this.idVendor = idVendor;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
