package com.company;
import database.dbControl;


public class Main {

    public static void main(String[] args) {

        dbControl dbc = new dbControl();
        Product prod = new Product(120.5, 12, 5);
        Vendor vendor = new Vendor("Claudio", "Hernandez", "123", "fake street", 1997,06,03, 80000);
        Client client = new Client("Juan", "Perez", "456", "another street", 19, 01, 2005);
        Bill billing = new Bill(client, vendor, 13,04,2022, prod);



        dbc.insertVendor(vendor);
        dbc.insertClient(client);


    }

}
