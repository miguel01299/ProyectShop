package com.entitylayer;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Color")
public class Color {

    @Id
    @GeneratedValue
    @Column(name = "Color&COLOR ID")
    private int color_id;

    @Column(name = "NAME")
    private String name;

    // One Color&color can have many products
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "color", cascade = CascadeType.ALL)
    private Set<Product> product;

    public Color() {
        super();
    }

    public Color(int color_id, String name, Set<Product> product) {
        this.color_id = color_id;
        this.name = name;
        this.product = product;
    }

    public int getcolor_id() {
        return color_id;
    }

    public void setcolor_id(int color_id) {
        this.color_id = color_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

}
