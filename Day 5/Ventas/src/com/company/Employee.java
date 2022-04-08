package com.company;

public class Employee {

    private String firstName;
    private String lastName;
    private String dni;
    private String adress;
    private int seniority;
    private String tel;
    private double salary;
    private Employee supervisor;

    public Employee(String firstName, String lastName, String dni, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.salary = salary;
        this.supervisor = null;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void increaseSalary(){
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", adress='" + adress + '\'' +
                ", seniority=" + seniority +
                ", tel='" + tel + '\'' +
                ", salary=" + salary +
                ", supervisor=" + supervisor +
                '}';
    }
}
