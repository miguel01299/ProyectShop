package com.serviceslayer;

import com.entitylayer.SizeColor;
import java.util.List;

public interface ISizeColorService {
SizeColor create(SizeColor SizeColor);
SizeColor update(SizeColor SizeColor);
SizeColor findById(Integer id);
List<SizeColor> findAll();
void delete(Integer id);
}
