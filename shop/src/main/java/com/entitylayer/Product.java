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

    // Foreign key size&color
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Size and Color ID")
    private SizeColor size_color;

    public Product() {
        super();
    }

    public Product(int product_id, String title, float price, float weight, int stock, Purchase purchase, Brand brand,
            SizeColor size_color) {
        this.product_id = product_id;
        this.title = title;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
        this.purchase = purchase;
        this.brand = brand;
        this.size_color = size_color;
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

    public SizeColor getSize_color() {
        return size_color;
    }

    public void setSize_color(SizeColor size_color) {
        this.size_color = size_color;
    }

}


