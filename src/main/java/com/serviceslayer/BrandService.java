package com.serviceslayer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entitylayer.Brand;
import com.repositorylayer.BrandRepository;
import java.util.Optional;


@Service
public class BrandService implements IBrandService{
 
	//Dependency injection
	@Autowired
	private BrandRepository brandRepo;
	
	
	@Override
	public Brand create(Brand Brand) {
		// TODO Auto-generated method stub
		return brandRepo.save(Brand);
	}

	@Override
	public Brand update(Brand Brand) {
		// TODO Auto-generated method stub
		return brandRepo.save(Brand);
	}

	@Override
	public Brand findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Brand> BrandOptional= brandRepo.findById(id);
		return BrandOptional.orElse(null);
	}

	@Override
	public List<Brand> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Brand>) brandRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		brandRepo.deleteById(id);
		
	}

}
