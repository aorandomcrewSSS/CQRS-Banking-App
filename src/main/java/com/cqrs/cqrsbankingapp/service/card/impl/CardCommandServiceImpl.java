package com.cqrs.cqrsbankingapp.service.card.impl;

import com.cqrs.cqrsbankingapp.domain.model.Card;
import com.cqrs.cqrsbankingapp.events.CardCreateEvent;
import com.cqrs.cqrsbankingapp.service.card.CardCommandService;
import com.cqrs.cqrsbankingapp.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardCommandServiceImpl implements CardCommandService {

    private final EventService service;

    @Override
    public void create(Card object) {
        CardCreateEvent event = new CardCreateEvent(object);
        service.create(event);
    }

}
