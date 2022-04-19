package models;

import java.util.ArrayList;

public class Store {

    private static Store myInstance;

    ArrayList<Product> products;
    ArrayList<Client> clients;
    ArrayList<Vendor> vendors;
    ArrayList<Bill> billings;

    public Store () {
        products = new ArrayList<Product>();
        clients = new ArrayList<Client>();
        vendors = new ArrayList<Vendor>();
        billings = new ArrayList<Bill>();
    }

    public Store getInstance(){
        if(myInstance == null)
            return myInstance = new Store();
        return myInstance;
    }

    public static Store getMyInstance(){
        return myInstance;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
    public ArrayList<Vendor> getVendors() {
        return vendors;
    }
    public ArrayList<Bill> getBilligs() {
        return billings;
    }
}
