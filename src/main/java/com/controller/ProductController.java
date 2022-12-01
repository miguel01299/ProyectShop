package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.Product;
import com.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product") //http://localhost:8080/api/product
public class ProductController {

    @Autowired
    private ProductService productService;

    //http://localhost:8080/api/product
    @PostMapping
    public Product addProduct(Product c){
        return productService.create(c);
    }

    @PutMapping("/{productId}") //http://localhost:8080/api/product/10 PUT
    public Product updateProduct(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/product GET
    public List<Product> getAllProduct(){
        return null;
    }

    @GetMapping ("/{productId}") //http://localhost:8080/api/product GET
    public Product getProductById(){

        return null;
    }

    @DeleteMapping ("/{productId}") //http://localhost:8080/api/product DELETE
    public void deleteProduct(){

    }
}