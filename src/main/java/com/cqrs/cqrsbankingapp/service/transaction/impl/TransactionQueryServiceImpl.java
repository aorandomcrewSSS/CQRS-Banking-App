package com.cqrs.cqrsbankingapp.service.transaction.impl;

import com.cqrs.cqrsbankingapp.domain.exception.ResourceNotFoundException;

import com.cqrs.cqrsbankingapp.domain.model.Transaction;
import com.cqrs.cqrsbankingapp.repository.TransactionRepository;
import com.cqrs.cqrsbankingapp.service.transaction.TransactionQueryService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionQueryServiceImpl implements TransactionQueryService {

    private final TransactionRepository repository;

    @Override
    public Transaction getById(UUID id) {
        return repository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
