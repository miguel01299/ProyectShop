package com.serviceslayer;

import com.entitylayer.Purchase;
import java.util.List;

public interface IPurchaseService {
Purchase create(Purchase Purchase);
Purchase update(Purchase Purchase);
Purchase findById(Integer id);
List<Purchase> findAll();
void delete(Integer id);
}
