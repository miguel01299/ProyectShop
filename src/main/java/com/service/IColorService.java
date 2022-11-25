package com.service;

import java.util.List;

import com.entity.Color;

public interface IColorService {
Color create(Color color);
Color update(Color color);
Color findById(Integer id);
List<Color> findAll();
void delete(Integer id);
}