package com.company;

public class Product {

    private int keyProduct;
    private double price;
    private int stock;
    private int minStock;

    public Product(int keyProduct, double price, int stock, int minStock) {
        this.keyProduct = keyProduct;
        this.price = price;
        this.stock = stock;
        this.minStock = minStock;
    }

    public int getKeyProduct() {
        return keyProduct;
    }

    public void setKeyProduct(int keyProduct) {
        this.keyProduct = keyProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "keyProduct=" + keyProduct +
                ", price=" + price +
                ", stock=" + stock +
                ", minStock=" + minStock +
                '}';
    }
}
