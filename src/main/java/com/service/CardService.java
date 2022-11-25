package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Card;
import com.repository.CardRepository;

import java.util.Optional;


@Service
public class CardService implements ICardService{
 
	//Dependency injection
	@Autowired
	private CardRepository cardRepo;
	
	
	@Override
	public Card create(Card Card) {
		// TODO Auto-generated method stub
		return cardRepo.save(Card);
	}

	@Override
	public Card update(Card Card) {
		// TODO Auto-generated method stub
		return cardRepo.save(Card);
	}

	@Override
	public Card findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Card> CardOptional= cardRepo.findById(id);
		return CardOptional.orElse(null);
	}

	@Override
	public List<Card> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Card>) cardRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		cardRepo.deleteById(id);
		
	}

}
