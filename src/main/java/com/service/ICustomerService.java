package com.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.entity.Customer;
import com.registration.CustomerRegistration;

public interface ICustomerService extends UserDetailsService{
Customer create(Customer customer);
Customer update(Customer customer);
Customer findById(Integer id);
List<Customer> findAll();
void delete(Integer id);
Page<Customer> findPaginated(int pageNo, int pageSize);
Customer save(CustomerRegistration registration);
}
