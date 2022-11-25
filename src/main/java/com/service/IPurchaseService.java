package com.service;

import java.util.List;

import com.entity.Purchase;

public interface IPurchaseService {
Purchase create(Purchase Purchase);
Purchase update(Purchase Purchase);
Purchase findById(Integer id);
List<Purchase> findAll();
void delete(Integer id);
}
