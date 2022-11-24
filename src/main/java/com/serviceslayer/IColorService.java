package com.serviceslayer;

import com.entitylayer.Color;
import java.util.List;

public interface IColorService {
Color create(Color color);
Color update(Color color);
Color findById(Integer id);
List<Color> findAll();
void delete(Integer id);
}