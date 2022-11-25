package com.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private float price;

    @Column(name = "weight")
    private float weight;

    @Column(name = "stock")
    private int stock;

    // Foreign key purchase
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchase_id")
    private Purchase purchase_id;

    // Foreign key brand
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
    private Brand brand_id;

    // Foreign key size
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "size_id")
    private Size size_id;
    
    // Foreign key size
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "color_id")
    private Color color_id;

    public Product() {
        super();
    }

	public Product(int id, String title, float price, float weight, int stock, Purchase purchase_id, Brand brand_id,
			Size size_id, Color color_id) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.weight = weight;
		this.stock = stock;
		this.purchase_id = purchase_id;
		this.brand_id = brand_id;
		this.size_id = size_id;
		this.color_id = color_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Purchase getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(Purchase purchase_id) {
		this.purchase_id = purchase_id;
	}

	public Brand getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Brand brand_id) {
		this.brand_id = brand_id;
	}

	public Size getSize_id() {
		return size_id;
	}

	public void setSize_id(Size size_id) {
		this.size_id = size_id;
	}

	public Color getColor_id() {
		return color_id;
	}

	public void setColor_id(Color color_id) {
		this.color_id = color_id;
	}

}


