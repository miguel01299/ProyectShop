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
@Table(name="SIZE")
public class Size {

    @Id
    @GeneratedValue
    @Column(name = "SIZE&COLOR ID")
    private int size_id;

    @Column(name = "NAME")
    private String name;

    // One size&color can have many products
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "size", cascade = CascadeType.ALL)
    private Set<Product> product;

    public Size() {
        super();
    }

    public Size(int size_id, String name, Set<Product> product) {
        this.size_id = size_id;
        this.name = name;
        this.product = product;
    }

    public int getsize_id() {
        return size_id;
    }

    public void setsize_id(int size_id) {
        this.size_id = size_id;
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
