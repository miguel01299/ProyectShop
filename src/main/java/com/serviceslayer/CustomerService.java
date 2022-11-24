package com.serviceslayer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entitylayer.Customer;
import com.repositorylayer.CustomerRepository;
import java.util.Optional;


@Service
public class CustomerService implements ICustomerService{
 
	//Dependency injection
	@Autowired
	private CustomerRepository customerRepo;
	
	
	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Customer> customerOptional= customerRepo.findById(id);
		return customerOptional.orElse(null);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Customer>) customerRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
		
	}

}
