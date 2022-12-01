package com.entity;

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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "birthsday")
    private Date birthsday;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    // One client can have many address
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer_id", cascade = CascadeType.ALL)
    private Set<Customer_address> customer_address;

    // One client can have many purchases
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer_id", cascade = CascadeType.ALL)
    private Set<Purchase> purchase;

    // One client can have many cards
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer_id", cascade = CascadeType.ALL)
    private Set<Card> card;

    public Customer() {
        super();
    }
        
    
    public Customer(int id, String name, String surname, Date birthsday, String email, String password, String role,
			Set<Customer_address> customer_address, Set<Purchase> purchase, Set<Card> card) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthsday = birthsday;
		this.email = email;
		this.password = password;
		this.role = role;
		this.customer_address = customer_address;
		this.purchase = purchase;
		this.card = card;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Set<Customer_address> getCustomer_address() {
		return customer_address;
	}


	public void setCustomer_address(Set<Customer_address> customer_address) {
		this.customer_address = customer_address;
	}


	public Set<Purchase> getPurchase() {
		return purchase;
	}


	public void setPurchase(Set<Purchase> purchase) {
		this.purchase = purchase;
	}


	public Set<Card> getCard() {
		return card;
	}


	public void setCard(Set<Card> card) {
		this.card = card;
	}


	@Override
    public String toString() {
        return "Customer ID= " + id + ", Name=" + name + " " + surname;

    }

}