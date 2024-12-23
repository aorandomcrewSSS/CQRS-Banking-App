package com.cqrs.cqrsbankingapp.service.card.impl;

import com.cqrs.cqrsbankingapp.domain.model.Card;
import com.cqrs.cqrsbankingapp.service.card.CardCommandService;
import com.cqrs.cqrsbankingapp.service.card.CardQueryService;
import com.cqrs.cqrsbankingapp.service.card.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardQueryService queryService;

    private final CardCommandService commandService;


    @Override
    public void create(Card object) {
        commandService.create(object);
    }

    @Override
    public Card getById(UUID id) {
        return queryService.getById(id);
    }
}
