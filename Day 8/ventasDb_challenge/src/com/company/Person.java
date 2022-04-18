package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    private static int idCount;
    private int id;
    private String firstName;
    private String lastName;
    private String dni;
    private String adress;
    private LocalDate birth;
    private Date birthSql;

    public Person(String firstName, String lastName, String dni, String adress, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.adress = adress;
        this.birth = LocalDate.of(year, month, day);
        //birthSql = birthSql.valueOf(birth);
        idCount++;
        this.id = idCount;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Person.idCount = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Date getBirthSql() {
        return birthSql;
    }

    public void setBirthSql(Date birthSql) {
        this.birthSql = birthSql;
    }
}
