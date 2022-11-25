package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Purchase;
import com.repository.PurchaseRepository;

import java.util.Optional;


@Service
public class PurchaseService implements IPurchaseService{
 
	//Dependency injection
	@Autowired
	private PurchaseRepository purchaseRepo;
	
	
	@Override
	public Purchase create(Purchase Purchase) {
		// TODO Auto-generated method stub
		return purchaseRepo.save(Purchase);
	}

	@Override
	public Purchase update(Purchase Purchase) {
		// TODO Auto-generated method stub
		return purchaseRepo.save(Purchase);
	}

	@Override
	public Purchase findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Purchase> PurchaseOptional= purchaseRepo.findById(id);
		return PurchaseOptional.orElse(null);
	}

	@Override
	public List<Purchase> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Purchase>) purchaseRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		purchaseRepo.deleteById(id);
		
	}

}
