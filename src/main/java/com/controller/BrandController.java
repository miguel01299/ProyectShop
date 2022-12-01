package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.Brand;
import com.service.BrandService;

import java.util.List;

@RestController
@RequestMapping("/api/brand") //http://localhost:8080/api/brand
public class BrandController {

    @Autowired
    private BrandService brandService;

    //http://localhost:8080/api/brand
    @PostMapping
    public Brand addBrand(Brand c){
        return brandService.create(c);
    }

    @PutMapping("/{brandId}") //http://localhost:8080/api/brand/10 PUT
    public Brand updateBrand(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/brand GET
    public List<Brand> getAllBrand(){
        return null;
    }

    @GetMapping ("/{brandId}") //http://localhost:8080/api/brand GET
    public Brand getBrandById(){

        return null;
    }

    @DeleteMapping ("/{brandId}") //http://localhost:8080/api/brand DELETE
    public void deleteBrand(){

    }
}