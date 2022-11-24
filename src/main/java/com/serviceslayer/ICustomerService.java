package com.serviceslayer;

import com.entitylayer.Customer;
import java.util.List;

public interface ICustomerService {
Customer create(Customer customer);
Customer update(Customer customer);
Customer findById(Integer id);
List<Customer> findAll();
void delete(Integer id);
}
