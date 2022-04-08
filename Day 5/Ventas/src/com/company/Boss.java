package com.company;

import jdk.incubator.vector.VectorMask;

import java.util.ArrayList;

public class Boss extends Employee{

    private boolean office;
    private Secretary sec;
    private ArrayList<Vendor> vendors;
    private Car c1;

    public Boss(String firstName, String lastName, String dni, double salary, boolean office, Secretary sec, Car c1) {
        super(firstName, lastName, dni, salary);
        this.office = office;
        this.sec = sec;
        vendors = new ArrayList<Vendor>();
        this.c1 = c1;
    }

    public boolean isOffice() {
        return office;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public Secretary getSec() {
        return sec;
    }

    public void setSec(Secretary sec) {
        this.sec = sec;
    }

    public ArrayList<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(ArrayList<Vendor> vendors) {
        this.vendors = vendors;
    }

    public void changeCar(Car c1){
        this.c1 = c1;
    }

    public void addVendor(Vendor a, ArrayList<Vendor> vendors){
        vendors.add(a);
    }

    public void increaseSalary(){
        setSalary(getSalary()*0.2);
    }

    public void deleteVendor(Vendor a, ArrayList<Vendor>vendors){
        for(Vendor e : vendors){
            if(a.equals(e)){
                vendors.remove(e);
            }
            else System.out.println("No esta en el sistema");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\nBoss{" +
                "office=" + office +
                ", sec=" + sec +
                ", vendors=" + vendors +
                ", c1=" + c1 +
                '}';
    }
}
