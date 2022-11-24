package com.serviceslayer;

import com.entitylayer.Product;
import java.util.List;

public interface IProductService {
Product create(Product Product);
Product update(Product Product);
Product findById(Integer id);
List<Product> findAll();
void delete(Integer id);
}
