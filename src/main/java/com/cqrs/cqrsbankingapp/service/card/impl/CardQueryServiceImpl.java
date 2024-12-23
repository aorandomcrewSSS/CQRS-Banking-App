package com.cqrs.cqrsbankingapp.service.card.impl;

import com.cqrs.cqrsbankingapp.domain.exception.ResourceNotFoundException;
import com.cqrs.cqrsbankingapp.domain.model.Card;
import com.cqrs.cqrsbankingapp.repository.CardRepository;
import com.cqrs.cqrsbankingapp.service.card.CardQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardQueryServiceImpl implements CardQueryService {

    private final CardRepository repository;

    @Override
    public Card getById(UUID id) {
        return repository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
