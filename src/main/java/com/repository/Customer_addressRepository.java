package com.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Customer_address;

@Repository
public interface Customer_addressRepository extends CrudRepository<Customer_address,Integer>{


} 