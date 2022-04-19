package models;

public class Vendor extends Person{

    private static int vendorId;
    private int venId;
    private double salary;

    public Vendor(String firstName, String lastName, String dni, String adress, int day, int month, int year, double salary){
        super(firstName, lastName, dni, adress, day, month, year);
        this.salary = salary;
        vendorId++;
        this.venId = vendorId;
    }

    public Vendor(){
        vendorId++;
        venId = vendorId;
    }

    public static int getVendorId() {
        return vendorId;
    }

    public static void setVendorId(int vendorId) {
        Vendor.vendorId = vendorId;
    }

    public int getIdVendor() {
        return venId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setIdVendor(int venId) {
        this.venId = venId;
    }

    public int getOwnId() {
        return venId;
    }

    public void setOwnId(int venId) {
        this.venId = venId;
    }


}
