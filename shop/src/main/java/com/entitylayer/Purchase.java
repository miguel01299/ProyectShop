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
@Table(name="PURCHASES")
public class Purchase
{
        @Id
        @GeneratedValue
        @Column(name="PURCHASE ID")
        private int purchase_id;
        
        @Column(name="STATUS")
        private String status;
    
        //One purchase can have many products attached
        @OneToMany(fetch = FetchType.EAGER,mappedBy="purchase",cascade = CascadeType.ALL)
        private Set<Product> product;
        
        //Foreign key customer
        @ManyToOne(cascade= CascadeType.ALL)
        @JoinColumn(name = "Customer ID")
        private Customer customer;

        //Foreign key customer address
        @ManyToOne(cascade= CascadeType.ALL)
        @JoinColumn(name = "Customer's Adress ID")
        private Customer_address customer_adress;

         
         public Purchase()
         {
             super();
         }
     

        public Purchase(int purchase_id, String status, Set<Product> product, Customer customer,
                Customer_address customer_adress) {
            this.purchase_id = purchase_id;
            this.status = status;
            this.product = product;
            this.customer = customer;
            this.customer_adress = customer_adress;
        }


        public int getPurchase_id() {
            return purchase_id;
        }

        public void setPurchase_id(int purchase_id) {
            this.purchase_id = purchase_id;
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

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public Customer_address getCustomer_adress() {
            return customer_adress;
        }

        public void setCustomer_adress(Customer_address customer_adress) {
            this.customer_adress = customer_adress;
        }

        
    
    
    }
