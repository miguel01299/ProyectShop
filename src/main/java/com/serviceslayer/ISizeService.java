package com.serviceslayer;

import com.entitylayer.Size;
import java.util.List;

public interface ISizeService {
Size create(Size size);
Size update(Size size);
Size findById(Integer id);
List<Size> findAll();
void delete(Integer id);
}
