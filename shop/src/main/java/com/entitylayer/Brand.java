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
@Table(name="BRAND")
public class Brand {

    @Id
    @GeneratedValue
    @Column(name = "BRAND ID")
    private int brand_id;

    @Column(name = "NAME")
    private String name;

    // One brand can have many products
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "brand", cascade = CascadeType.ALL)
    private Set<Product> product;

    public Brand() {
        super();
    }

    public Brand(int brand_id, String name, Set<Product> product) {
        this.brand_id = brand_id;
        this.name = name;
        this.product = product;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
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
