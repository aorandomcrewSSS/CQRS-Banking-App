package com.cqrs.cqrsbankingapp.service.transaction.impl;

import com.cqrs.cqrsbankingapp.domain.model.Transaction;
import com.cqrs.cqrsbankingapp.service.transaction.TransactionCommandService;
import com.cqrs.cqrsbankingapp.service.transaction.TransactionQueryService;
import com.cqrs.cqrsbankingapp.service.transaction.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionQueryService queryService;

    private final TransactionCommandService commandService;


    @Override
    public void create(Transaction object) {
        commandService.create(object);
    }

    @Override
    public Transaction getById(UUID id) {
        return queryService.getById(id);
    }
}
