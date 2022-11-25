package com.service;

import java.util.List;

import com.entity.Product;

public interface IProductService {
Product create(Product Product);
Product update(Product Product);
Product findById(Integer id);
List<Product> findAll();
void delete(Integer id);
}
