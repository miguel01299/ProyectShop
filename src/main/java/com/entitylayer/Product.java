package com.entitylayer;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT ID")
    private int product_id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PRICE")
    private float price;

    @Column(name = "WEIGHT")
    private float weight;

    @Column(name = "STOCK")
    private int stock;

    // Foreign key purchase
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Purchase ID")
    private Purchase purchase;

    // Foreign key brand
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Brand ID")
    private Brand brand;

    // Foreign key size
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Size ID")
    private Size size;
    
    // Foreign key size
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Color ID")
    private Color color;

    public Product() {
        super();
    }

    public Product(int product_id, String title, float price, float weight, int stock, Purchase purchase, Brand brand,
            Size size, Color color) {
        this.product_id = product_id;
        this.title = title;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
        this.purchase = purchase;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize_color(Size size) {
        this.size = size;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}


