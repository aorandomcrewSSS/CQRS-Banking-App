package com.cqrs.cqrsbankingapp.service.account.impl;

import com.cqrs.cqrsbankingapp.domain.model.Account;
import com.cqrs.cqrsbankingapp.events.AccountCreateEvent;
import com.cqrs.cqrsbankingapp.service.account.AccountCommandService;
import com.cqrs.cqrsbankingapp.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountCommandServiceImpl implements AccountCommandService {

    private final EventService service;

    @Override
    public void create(Account object) {
        AccountCreateEvent event = new AccountCreateEvent(object);
        service.create(event);
    }

}
