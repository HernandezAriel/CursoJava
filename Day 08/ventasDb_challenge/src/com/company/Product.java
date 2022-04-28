package com.company;

public class Product {

    private static int productId;
    private int keyProduct;
    private double price;
    private int stock;
    private int minStock;

    public Product(double price, int stock, int minStock) {
        productId++;
        this.keyProduct = productId;
        this.price = price;
        this.stock = stock;
        this.minStock = minStock;
    }

    public static int getProductId() {
        return productId;
    }

    public static void setProductId(int productId) {
        Product.productId = productId;
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
}
