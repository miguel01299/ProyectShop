package com.service;

import java.util.List;

import com.entity.Customer;

public interface ICustomerService {
Customer create(Customer customer);
Customer update(Customer customer);
Customer findById(Integer id);
List<Customer> findAll();
void delete(Integer id);
}
