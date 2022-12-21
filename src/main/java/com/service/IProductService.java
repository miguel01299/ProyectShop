package com.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.entity.Customer;
import com.entity.Product;

public interface IProductService{
Product create(Product Product);
Product update(Product Product);
Product findById(Integer id);
List<Product> findAll();
void delete(Integer id);
Page<Product> findPaginated(int pageNo, int pageSize);
}
