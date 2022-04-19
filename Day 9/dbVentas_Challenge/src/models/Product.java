package models;

public class Product {

    private double price;
    private int stock;
    private int minStock;

    public Product(double price, int stock, int minStock){
        this.price = price;
        this.stock = stock;
        this.minStock = minStock;
    }

    public Product(){

    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public int getMinStock(){
        return minStock;
    }

    public void setMinStock(int minStock){
        this.minStock = minStock;
    }
}
