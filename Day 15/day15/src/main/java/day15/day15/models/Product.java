package day15.day15.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "products",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "key")
        })

public class Product {
    
    @ApiModelProperty(hidden = true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ApiModelProperty(position = 1)
    @NotBlank
    @Size(max = 20)
    @Column(name = "name")
    private String name;

    @ApiModelProperty(position = 2)
    @NotBlank
    @Size(max = 40)
    @Column(name = "key")
    private double key;

    @ApiModelProperty(position = 3)
    @NotBlank
    @Size(max = 50)
    @Column(name = "stock")
    private int stock;

    @ApiModelProperty(position = 0)
    @NotBlank
    @Size(max = 120)
    @Column(name = "price")
    private double price;

    public Product(){

    }

    public Product(String name, double key, int stock, double price){
        this.name = name;
        this.key = key;
        this.stock = stock;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKey() {
        return key;
    }

    public void setKey(double key) {
        this.key = key;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
