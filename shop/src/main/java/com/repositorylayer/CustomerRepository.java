package com.repositorylayer;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entitylayer.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{


} 