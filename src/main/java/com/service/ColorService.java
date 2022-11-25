package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Color;
import com.repository.ColorRepository;

import java.util.Optional;


@Service
public class ColorService implements IColorService{
 
	//Dependency injection
	@Autowired
	private ColorRepository colorRepo;
	
	
	@Override
	public Color create(Color color) {
		// TODO Auto-generated method stub
		return colorRepo.save(color);
	}

	@Override
	public Color update(Color color) {
		// TODO Auto-generated method stub
		return colorRepo.save(color);
	}

	@Override
	public Color findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Color> ColorOptional= colorRepo.findById(id);
		return ColorOptional.orElse(null);
	}

	@Override
	public List<Color> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Color>) colorRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		colorRepo.deleteById(id);	
	}

}
