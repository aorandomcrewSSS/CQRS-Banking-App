package com.cqrs.cqrsbankingapp.service.transaction.impl;

import com.cqrs.cqrsbankingapp.domain.model.Transaction;
import com.cqrs.cqrsbankingapp.events.TransactionCreateEvent;
import com.cqrs.cqrsbankingapp.service.event.EventService;
import com.cqrs.cqrsbankingapp.service.transaction.TransactionCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionCommandServiceImpl implements TransactionCommandService {

    private final EventService service;

    @Override
    public void create(Transaction object) {
        TransactionCreateEvent event = new TransactionCreateEvent(object);
        service.create(event);
    }

}
