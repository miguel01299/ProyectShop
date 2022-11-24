package com.serviceslayer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entitylayer.SizeColor;
import com.repositorylayer.SizeColorRepository;
import java.util.Optional;


@Service
public class SizeColorService implements ISizeColorService{
 
	//Dependency injection
	@Autowired
	private SizeColorRepository size_colorRepo;
	
	
	@Override
	public SizeColor create(SizeColor SizeColor) {
		// TODO Auto-generated method stub
		return size_colorRepo.save(SizeColor);
	}

	@Override
	public SizeColor update(SizeColor SizeColor) {
		// TODO Auto-generated method stub
		return size_colorRepo.save(SizeColor);
	}

	@Override
	public SizeColor findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <SizeColor> SizeColorOptional= size_colorRepo.findById(id);
		return SizeColorOptional.orElse(null);
	}

	@Override
	public List<SizeColor> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<SizeColor>) size_colorRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		size_colorRepo.deleteById(id);
		
	}

}
