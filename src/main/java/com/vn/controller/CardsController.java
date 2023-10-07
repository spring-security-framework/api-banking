package com.vn.controller;

import com.vn.model.Cards;
import com.vn.repo.CardsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class CardsController {
    @Autowired
    private CardsRepo cardsRepo;

    @GetMapping("/myCards")
    public List<Cards> getCardDetails(
            @RequestParam int id
    ) {
        List<Cards> cards = cardsRepo.findByCustomerId(id);
        if (cards != null ) {
            return cards;
        }else {
            return null;
        }
    }
}
