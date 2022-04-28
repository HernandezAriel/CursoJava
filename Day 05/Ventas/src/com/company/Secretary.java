package com.company;

public class Secretary extends Employee {

    private boolean office;
    private String fax;

    public Secretary(String firstName, String lastName, String dni, double salary, boolean office, String fax) {
        super(firstName, lastName, dni, salary);
        this.office = office;
        this.fax = fax;
    }

    public boolean isOffice() {
        return office;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSecretary{" +
                "office=" + office +
                ", fax='" + fax + '\'' +
                '}';
    }
}
