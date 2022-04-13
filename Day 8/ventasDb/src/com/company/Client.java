package com.company;

public class Client extends Person{

    private int idClient;

    public Client(String firstName, String lastName, int dni, String adress, int idClient
    ) {
        super(firstName, lastName, dni, adress);
        this.idClient = idClient;
    }
}
