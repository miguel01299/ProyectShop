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
@Table(name="purchase")
public class Purchase
{
        @Id
        @GeneratedValue
        @Column(name="id")
        private int id;
        
        @Column(name="status")
        private String status;
    
        //One purchase can have many products attached
        @OneToMany(fetch = FetchType.EAGER,mappedBy="purchase_id",cascade = CascadeType.ALL)
        private Set<Product> product;
        
        //Foreign key customer
        @ManyToOne(cascade= CascadeType.ALL)
        @JoinColumn(name = "customer_id")
        private Customer customer_id;

        //Foreign key customer address
        @ManyToOne(cascade= CascadeType.ALL)
        @JoinColumn(name = "customer_adress_id")
        private Customer_address customer_adress_id;

         
         public Purchase()
         {
             super();
         }


		public Purchase(int id, String status, Set<Product> product, Customer customer_id,
				Customer_address customer_adress_id) {
			super();
			this.id = id;
			this.status = status;
			this.product = product;
			this.customer_id = customer_id;
			this.customer_adress_id = customer_adress_id;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public Set<Product> getProduct() {
			return product;
		}


		public void setProduct(Set<Product> product) {
			this.product = product;
		}


		public Customer getCustomer_id() {
			return customer_id;
		}


		public void setCustomer_id(Customer customer_id) {
			this.customer_id = customer_id;
		}


		public Customer_address getCustomer_adress_id() {
			return customer_adress_id;
		}


		public void setCustomer_adress_id(Customer_address customer_adress_id) {
			this.customer_adress_id = customer_adress_id;
		}
     
    
    
    }
