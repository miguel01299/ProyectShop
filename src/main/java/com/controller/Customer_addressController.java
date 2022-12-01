package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.Customer_address;
import com.service.Customer_addressService;

import java.util.List;

@RestController
@RequestMapping("/api/customer_address") //http://localhost:8080/api/customer_address
public class Customer_addressController {

    @Autowired
    private Customer_addressService customer_addressService;

    //http://localhost:8080/api/customer_address
    @PostMapping
    public Customer_address addCustomer_address(Customer_address c){
        return customer_addressService.create(c);
    }

    @PutMapping("/{customer_addressId}") //http://localhost:8080/api/customer_address/10 PUT
    public Customer_address updateCustomer_address(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/customer_address GET
    public List<Customer_address> getAllCustomer_address(){
        return null;
    }

    @GetMapping ("/{customer_addressId}") //http://localhost:8080/api/customer_address GET
    public Customer_address getCustomer_addressById(){

        return null;
    }

    @DeleteMapping ("/{customer_addressId}") //http://localhost:8080/api/customer_address DELETE
    public void deleteCustomer_address(){

    }
}