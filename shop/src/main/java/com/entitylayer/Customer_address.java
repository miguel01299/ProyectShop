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
@Table(name="EMPLOYEE'S ADRESS")
public class Customer_address
{
        @Id
        @GeneratedValue
        @Column(name="CUSTOMER ADRESS ID")
        private int adress_id;
        
        @Column(name="COUNTRY")
        private String country;
    
        @Column(name="CITY")
        private String city;
    
        @Column(name="POSTAL CODE")
        private String postalcode;
    
        @Column(name="STREET")
        private String street;
    
        @Column(name="NUMBER")
        private int password;
    
        @Column(name="Floor, door and more")
        private String floor_door;
    
        //One address can have many purchases attached
        @OneToMany(fetch = FetchType.EAGER,mappedBy="customer_adress",cascade = CascadeType.ALL)
        private Set<Purchase> purchase;
        
        //Foreign key customer
        @ManyToOne(cascade= CascadeType.ALL)
        @JoinColumn(name = "Customer ID")
        private Customer customer;

        public Customer_address()
    {
        super();
    }

        
        public Customer_address(int adress_id, String country, String city, String postalcode, String street, int password,
            String floor_door, Set<Purchase> purchase, Customer customer) {
        this.adress_id = adress_id;
        this.country = country;
        this.city = city;
        this.postalcode = postalcode;
        this.street = street;
        this.password = password;
        this.floor_door = floor_door;
        this.purchase = purchase;
        this.customer = customer;
    }

        public int getAdress_id() {
            return adress_id;
        }

        public void setAdress_id(int adress_id) {
            this.adress_id = adress_id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPostalcode() {
            return postalcode;
        }

        public void setPostalcode(String postalcode) {
            this.postalcode = postalcode;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        public String getFloor_door() {
            return floor_door;
        }

        public void setFloor_door(String floor_door) {
            this.floor_door = floor_door;
        }

        public Set<Purchase> getPurchase() {
            return purchase;
        }

        public void setPurchase(Set<Purchase> purchase) {
            this.purchase = purchase;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }
    
    
    }

