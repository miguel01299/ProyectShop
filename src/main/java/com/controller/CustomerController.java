package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.Customer;
import com.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customer") //http://localhost:8080/api/customer
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //http://localhost:8080/api/customer
    @PostMapping
    public Customer addCustomer(Customer c){
        return customerService.create(c);
    }

    @PutMapping("/{customerId}") //http://localhost:8080/api/customer/10 PUT
    public Customer updateCustomer(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/customer GET
    public List<Customer> getAllCustomer(){
        return null;
    }

    @GetMapping ("/{customerId}") //http://localhost:8080/api/customer GET
    public Customer getCustomerById(){

        return null;
    }

    @DeleteMapping ("/{customerId}") //http://localhost:8080/api/customer DELETE
    public void deleteCustomer(){

    }
}