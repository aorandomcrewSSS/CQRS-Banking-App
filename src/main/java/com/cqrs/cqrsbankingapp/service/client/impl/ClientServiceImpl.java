package com.cqrs.cqrsbankingapp.service.client.impl;

import com.cqrs.cqrsbankingapp.domain.model.Client;
import com.cqrs.cqrsbankingapp.service.client.ClientCommandService;
import com.cqrs.cqrsbankingapp.service.client.ClientQueryService;
import com.cqrs.cqrsbankingapp.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientQueryService queryService;

    private final ClientCommandService commandService;


    @Override
    public void create(Client object) {
        commandService.create(object);
    }

    @Override
    public Client getById(UUID id) {
        return queryService.getById(id);
    }
}
