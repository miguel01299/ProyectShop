package com.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Purchase;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase,Integer>{


} 