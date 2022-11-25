package com.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="card")
public class Card {

    
	@Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "number")
    private String number;

    @Column(name = "validity_date")
    private Date validity_date;

    @Column(name = "owner")
    private String owner;

    @Column(name = "cvv_pin")
    private int cvv_pin;

    //Foreign key customer
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer_id;

    public Card()
    {
        super();
    }
    
    
    

    public Card(int id, String number, Date validity_date, String owner, int cvv_pin, Customer customer_id) {
		super();
		this.id = id;
		this.number = number;
		this.validity_date = validity_date;
		this.owner = owner;
		this.cvv_pin = cvv_pin;
		this.customer_id = customer_id;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCvv_pin() {
		return cvv_pin;
	}

	public void setCvv_pin(int cvv_pin) {
		this.cvv_pin = cvv_pin;
	}

	public Customer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}


    
}
