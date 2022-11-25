package com.service;

import java.util.List;

import com.entity.Size;

public interface ISizeService {
Size create(Size size);
Size update(Size size);
Size findById(Integer id);
List<Size> findAll();
void delete(Integer id);
}
