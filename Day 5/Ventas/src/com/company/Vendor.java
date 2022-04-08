package com.company;

public class Vendor extends Employee{

    private Car c1;
    private String areaVendor;
    private String client;
    private double plus;

    public Vendor(String firstName, String lastName, String dni, double salary, String client, double plus) {
        super(firstName, lastName, dni, salary);
        this.areaVendor = areaVendor;
        this.client = client;
        this.plus = plus;
        this.c1 = null;
    }

    public String getAreaVendor() {
        return areaVendor;
    }

    public void setAreaVendor(String areaVendor) {
        this.areaVendor = areaVendor;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }

    public void setC1(Car c1) {
        this.c1 = c1;
    }

    public void increaseSalary(){
        setSalary(getSalary()*0.1);
    }

    @Override
    public String toString() {
        return super.toString()+"\nVendor{" +
                ", areaVendor='" + areaVendor + '\'' +
                ", client='" + client + '\'' +
                ", plus=" + plus +
                '}';
    }
}
