package com.service;

import java.util.List;

import com.entity.Card;

public interface ICardService {
Card create(Card Card);
Card update(Card Card);
Card findById(Integer id);
List<Card> findAll();
void delete(Integer id);
}
