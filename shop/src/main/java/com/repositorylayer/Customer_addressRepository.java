package com.repositorylayer;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entitylayer.Customer_address;

@Repository
public interface Customer_addressRepository extends CrudRepository<Customer_address,Integer>{


} 