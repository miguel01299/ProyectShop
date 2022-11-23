package com.entitylayer;

import java.util.Set;
import java.util.Date;
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
@Table(name="CARD")
public class Card {

    
    @Id
    @GeneratedValue
    @Column(name = "CARD ID")
    private int card_id;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "VALIDITY DATE")
    private Date validity_date;

    @Column(name = "OWNER")
    private String owner;

    @Column(name = "CVV PIN")
    private int cvv;

    //Foreign key customer
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "Customer ID")
    private Customer customer;

    public Card()
    {
        super();
    }

    public Card(int card_id, String number, Date validity_date, String owner, int cvv, Customer customer) {
        this.card_id = card_id;
        this.number = number;
        this.validity_date = validity_date;
        this.owner = owner;
        this.cvv = cvv;
        this.customer = customer;
    }


    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getValidity_date() {
        return validity_date;
    }

    public void setValidity_date(Date validity_date) {
        this.validity_date = validity_date;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
