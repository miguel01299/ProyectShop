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
@Table(name="SIZE/COLOR")
public class SizeColor {

    @Id
    @GeneratedValue
    @Column(name = "SIZE&COLOR ID")
    private int size_color_id;

    @Column(name = "NAME")
    private String name;

    // One size&color can have many products
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "size_color", cascade = CascadeType.ALL)
    private Set<Product> product;

    public SizeColor() {
        super();
    }

    public SizeColor(int size_color_id, String name, Set<Product> product) {
        this.size_color_id = size_color_id;
        this.name = name;
        this.product = product;
    }

    public int getSize_color_id() {
        return size_color_id;
    }

    public void setSize_color_id(int size_color_id) {
        this.size_color_id = size_color_id;
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
