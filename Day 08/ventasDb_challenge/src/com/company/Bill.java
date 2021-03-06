package com.company;

import database.dbControl;

import java.time.LocalDate;
import java.util.Date;

public class Bill {

    private static int billId;
    private int numBill;
    private LocalDate date;
    private Date dateSQL;
    private Client client;
    private Vendor vendor;
    private Product product;

    public Bill(Client client, Vendor vendor, int day, int month, int year, Product product) {
        billId++;
        this.numBill = billId;
        this.date = LocalDate.of(year, month, day);
        //dateSQL = dateSQL.valueOf(date);
        this.client = client;
        this.vendor = vendor;
        this.product = product;
    }

    public static int getBillId() {
        return billId;
    }

    public static void setBillId(int billId) {
        Bill.billId = billId;
    }

    public int getNumBill() {
        return numBill;
    }

    public void setNumBill(int numBill) {
        this.numBill = numBill;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Date getDateSQL() {
        return dateSQL;
    }

    public void setDateSQL(Date dateSQL) {
        this.dateSQL = dateSQL;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
