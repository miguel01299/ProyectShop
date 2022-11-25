package com.entity;

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
@Table(name="customer_address")
public class Customer_address
{
        @Id
        @GeneratedValue
        @Column(name="id")
        private int id;
        
        @Column(name="country")
        private String country;
    
        @Column(name="city")
        private String city;
    
        @Column(name="postalcode")
        private String postalcode;
    
        @Column(name="street")
        private String street;
    
        @Column(name="numberstreet")
        private int numberstreet;
    
        @Column(name="flooranddoor")
        private String flooranddoor;
    
        //One address can have many purchases attached
        @OneToMany(fetch = FetchType.EAGER,mappedBy="customer_adress_id",cascade = CascadeType.ALL)
        private Set<Purchase> purchase;
        
        //Foreign key customer
        @ManyToOne(cascade= CascadeType.ALL)
        @JoinColumn(name = "customer_id")
        private Customer customer_id;

        public Customer_address()
    {
        super();
    }

        
		public Customer_address(int id, String country, String city, String postalcode, String street, int numberstreet,
				String flooranddoor, Set<Purchase> purchase, Customer customer_id) {
			super();
			this.id = id;
			this.country = country;
			this.city = city;
			this.postalcode = postalcode;
			this.street = street;
			this.numberstreet = numberstreet;
			this.flooranddoor = flooranddoor;
			this.purchase = purchase;
			this.customer_id = customer_id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public int getNumberstreet() {
			return numberstreet;
		}

		public void setNumberstreet(int numberstreet) {
			this.numberstreet = numberstreet;
		}

		public String getFlooranddoor() {
			return flooranddoor;
		}

		public void setFlooranddoor(String flooranddoor) {
			this.flooranddoor = flooranddoor;
		}

		public Set<Purchase> getPurchase() {
			return purchase;
		}

		public void setPurchase(Set<Purchase> purchase) {
			this.purchase = purchase;
		}

		public Customer getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(Customer customer_id) {
			this.customer_id = customer_id;
		}

        
    
    }

