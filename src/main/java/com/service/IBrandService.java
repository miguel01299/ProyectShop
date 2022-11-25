package com.service;

import java.util.List;

import com.entity.Brand;

public interface IBrandService {
Brand create(Brand Brand);
Brand update(Brand Brand);
Brand findById(Integer id);
List<Brand> findAll();
void delete(Integer id);
}
