package com.serviceslayer;

import com.entitylayer.Brand;
import java.util.List;

public interface IBrandService {
Brand create(Brand Brand);
Brand update(Brand Brand);
Brand findById(Integer id);
List<Brand> findAll();
void delete(Integer id);
}
