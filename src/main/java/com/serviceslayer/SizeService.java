package com.serviceslayer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entitylayer.Size;
import com.repositorylayer.SizeRepository;
import java.util.Optional;


@Service
public class SizeService implements ISizeService{
 
	//Dependency injection
	@Autowired
	private SizeRepository sizeRepo;
	
	
	@Override
	public Size create(Size size) {
		// TODO Auto-generated method stub
		return sizeRepo.save(size);
	}

	@Override
	public Size update(Size size) {
		// TODO Auto-generated method stub
		return sizeRepo.save(size);
	}

	@Override
	public Size findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Size> SizeOptional= sizeRepo.findById(id);
		return SizeOptional.orElse(null);
	}

	@Override
	public List<Size> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Size>) sizeRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		sizeRepo.deleteById(id);	
	}

}
