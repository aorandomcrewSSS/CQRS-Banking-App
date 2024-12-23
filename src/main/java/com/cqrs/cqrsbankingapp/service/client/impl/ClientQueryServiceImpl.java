package com.cqrs.cqrsbankingapp.service.client.impl;

import com.cqrs.cqrsbankingapp.domain.exception.ResourceNotFoundException;
import com.cqrs.cqrsbankingapp.domain.model.Client;
import com.cqrs.cqrsbankingapp.repository.ClientRepository;
import com.cqrs.cqrsbankingapp.service.client.ClientQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientQueryServiceImpl implements ClientQueryService {

    private final ClientRepository repository;

    @Override
    public Client getById(UUID id) {
        return repository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
