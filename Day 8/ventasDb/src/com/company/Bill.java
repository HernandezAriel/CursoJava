package com.company;

public class Bill {

    private int numBill;
    private String buyDate;
    private Client buyer;
    private Vendor vendor;
    private String details;

    public Bill(int numBill, String buyDate, Client buyer, Vendor vendor, String details) {
        this.numBill = numBill;
        this.buyDate = buyDate;
        this.buyer = buyer;
        this.vendor = vendor;
        this.details = details;
    }

    public int getNumBill() {
        return numBill;
    }

    public void setNumBill(int numBill) {
        this.numBill = numBill;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public Client getBuyer() {
        return buyer;
    }

    public void setBuyer(Client buyer) {
        this.buyer = buyer;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "numBill=" + numBill +
                ", buyDate='" + buyDate + '\'' +
                ", buyer=" + buyer +
                ", vendor=" + vendor +
                ", details='" + details + '\'' +
                '}';
    }
}
