package com.service;

import java.util.List;

import com.entity.Customer_address;

public interface ICustomer_addressService {
Customer_address create(Customer_address Customer_address);
Customer_address update(Customer_address Customer_address);
Customer_address findById(Integer id);
List<Customer_address> findAll();
void delete(Integer id);
}
