package com.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Size;

@Repository
public interface SizeRepository extends CrudRepository<Size,Integer>{


} 