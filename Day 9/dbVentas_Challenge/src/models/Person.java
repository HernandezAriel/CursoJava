package models;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    protected static int idInfo;
    protected int id;

    protected String firstName;
    protected String lastName;
    protected String dni;
    protected String address;
    protected LocalDate birth;
    protected Date birthSql;

    public Person(String firstName, String lastName, String dni, String address, int day, int month, int year){
        //super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.address = address;
        this.birth = LocalDate.of(year, month, day);
        //birthSql = birthSql.valueOf(birth);
        idInfo++;
        id = idInfo;
    }

    public Person(){
        idInfo++;
        id = idInfo;
    }

    public static int getIdInfo(){
        return idInfo;
    }

    public static void setIdInfo(int idInfo){
        Person.idInfo = idInfo;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public Date getBirthSQL() {
        return birthSql;
    }
    public void setBirthSQL(Date birthSql) {
        this.birthSql = birthSql;
    }
}
