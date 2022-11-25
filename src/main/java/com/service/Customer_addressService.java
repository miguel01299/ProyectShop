package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer_address;
import com.repository.Customer_addressRepository;

import java.util.Optional;


@Service
public class Customer_addressService implements ICustomer_addressService{
 
	//Dependency injection
	@Autowired
	private Customer_addressRepository Customer_address_addressRepo;
	
	
	@Override
	public Customer_address create(Customer_address Customer_address) {
		// TODO Auto-generated method stub
		return Customer_address_addressRepo.save(Customer_address);
	}

	@Override
	public Customer_address update(Customer_address Customer_address) {
		// TODO Auto-generated method stub
		return Customer_address_addressRepo.save(Customer_address);
	}

	@Override
	public Customer_address findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Customer_address> Customer_addressOptional= Customer_address_addressRepo.findById(id);
		return Customer_addressOptional.orElse(null);
	}

	@Override
	public List<Customer_address> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Customer_address>) Customer_address_addressRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Customer_address_addressRepo.deleteById(id);
		
	}

}
