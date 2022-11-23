package com.entitylayer;

import java.util.Set;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER ID")
    private int customer_id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "BIRTHSDAY")
    private Date birthsday;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "R0LE")
    private String role;

    // One client can have many address
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Customer_address> customerAdress;

    // One client can have many purchasesF
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Purchase> purchase;

    // One client can have many cards
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Card> card;

    public Customer(int customer_id, String name, String surname, Date birthsday, String email, String password,
            String role, Set<Customer_address> customerAdress, Set<Purchase> purchase, Set<Card> card) {
        this.customer_id = customer_id;
        this.name = name;
        this.surname = surname;
        this.birthsday = birthsday;
        this.email = email;
        this.password = password;
        this.role = role;
        this.customerAdress = customerAdress;
        this.purchase = purchase;
        this.card = card;
    }

    public Customer() {
        super();
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthsday() {
        return birthsday;
    }

    public void setBirthsday(Date birthsday) {
        this.birthsday = birthsday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Customer_address> getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(Set<Customer_address> customerAdress) {
        this.customerAdress = customerAdress;
    }

    public Set<Purchase> getPurchase() {
        return purchase;
    }

    public void setCard(Set<Card> card) {
        this.card = card;
    }

    public Set<Card> getCard() {
        return card;
    }

    public void setPurchase(Set<Purchase> purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Customer ID= " + customer_id + ", Name=" + name + " " + surname;

    }

}