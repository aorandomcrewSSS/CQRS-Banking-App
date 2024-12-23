package com.cqrs.cqrsbankingapp.service.client.impl;

import com.cqrs.cqrsbankingapp.domain.model.Client;
import com.cqrs.cqrsbankingapp.events.ClientCreateEvent;
import com.cqrs.cqrsbankingapp.service.client.ClientCommandService;
import com.cqrs.cqrsbankingapp.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCommandServiceImpl implements ClientCommandService {

    private final EventService service;

    @Override
    public void create(Client object) {
        ClientCreateEvent event = new ClientCreateEvent(object);
        service.create(event);
    }

}
