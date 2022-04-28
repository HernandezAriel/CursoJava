package models;

import java.time.LocalDate;
import java.util.Date;

public class Bill {

    private LocalDate date;
    private Date dateSql;
    private int client;
    private int vendor;
    int products[];
    int pos;

    public Bill(int client, int vendor, int day, int month, int year, Product product){
        //super();
        this.date = LocalDate.of(year, month, day);
        //dateSql = dateSql.valueOf(date);
        this.client = client;
        this.vendor = vendor;
        this.products = new int[20];
        pos = 0;
    }

    public Bill() {
        this.products = new int[20];
        pos = 0;
    }

    public int[] getProducts(){
        return products;
    }

    public int getProduct(int i){
        return products[i];
    }

    public void insertProducts(int prod){
        products[pos] = prod;
        pos++;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Date getDateSql(){
        return dateSql;
    }

    public void setDateSql(Date dateSql){
        this.dateSql = dateSql;
    }

    public int getClient(){
        return client;
    }

    public void setClient(int client){
        this.client = client;
    }

    public int getVendor(){
        return vendor;
    }

    public void setVendor(int vendor){
        this.vendor = vendor;
    }

}
