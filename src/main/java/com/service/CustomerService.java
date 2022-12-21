package com.service;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.entity.Customer;
import com.entity.Role;
import com.exception.CommonException;
import com.registration.CustomerRegistration;
import com.repository.CustomerRepository;

import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.PersistenceException;



@Service
public class CustomerService implements ICustomerService{
 
	//Dependency injection
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public CustomerService(CustomerRepository customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}
	
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
		Customer customer = null;
	    if (customerOptional.isPresent()) {
	        customer = customerOptional.get();
	    } else {
	        throw new RuntimeException(" Customer not found for id : " + id);
	    }
	    return customer;
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

	@Override
	public Page<Customer> findPaginated(int pageNo, int pageSize) {
	 PageRequest pageable = PageRequest.of(pageNo - 1, pageSize);
	 return this.customerRepo.findAll(pageable);
	}

	@Override
	public Customer save(CustomerRegistration registration) {
		//check
		try {
			Customer customer= new Customer(0, registration.getName(),registration.getSurname(),registration.getBirthsday(),registration.getEmail(), passwordEncoder.encode(registration.getPassword()), Arrays.asList(new Role("ROLE_USER")));
			return customerRepo.save(customer);
		} catch (Exception e) {
			throw new CommonException("User already registered. Try another email.", e);
		}
		

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer customer = customerRepo.findByEmail(username);
		if(customer == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(customer.getEmail(), customer.getPassword(), mapRolesToAuthorities(customer.getRoles()));		
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
	}
	
	


