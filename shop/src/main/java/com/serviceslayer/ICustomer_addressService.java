package com.serviceslayer;

import com.entitylayer.Customer_address;
import java.util.List;

public interface ICustomer_addressService {
Customer_address create(Customer_address Customer_address);
Customer_address update(Customer_address Customer_address);
Customer_address findById(Integer id);
List<Customer_address> findAll();
void delete(Integer id);
}
