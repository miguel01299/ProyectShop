package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.Card;
import com.service.CardService;

import java.util.List;

@RestController
@RequestMapping("/api/card") //http://localhost:8080/api/card
public class CardController {

    @Autowired
    private CardService cardService;

    //http://localhost:8080/api/card
    @PostMapping
    public Card addCard(Card c){
        return cardService.create(c);
    }

    @PutMapping("/{cardId}") //http://localhost:8080/api/card/10 PUT
    public Card updateCard(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/card GET
    public List<Card> getAllCard(){
        return null;
    }

    @GetMapping ("/{cardId}") //http://localhost:8080/api/card GET
    public Card getCardById(){

        return null;
    }

    @DeleteMapping ("/{cardId}") //http://localhost:8080/api/card DELETE
    public void deleteCard(){

    }
}