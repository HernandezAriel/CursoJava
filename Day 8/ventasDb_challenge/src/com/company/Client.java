package com.company;

public class Client extends Person{

    private static int clientId;
    private int idClient;

    public Client(String firstName, String lastName, String dni, String adress, int day, int month, int year) {
        super(firstName, lastName, dni, adress, day, month, year);
        clientId++;
        this.idClient = idClient;
    }

    public static int getClientId() {
        return clientId;
    }

    public static void setClientId(int clientId) {
        Client.clientId = clientId;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
