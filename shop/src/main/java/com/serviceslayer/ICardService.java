package com.serviceslayer;

import com.entitylayer.Card;
import java.util.List;

public interface ICardService {
Card create(Card Card);
Card update(Card Card);
Card findById(Integer id);
List<Card> findAll();
void delete(Integer id);
}
