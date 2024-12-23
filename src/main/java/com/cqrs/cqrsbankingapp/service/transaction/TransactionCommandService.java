package com.cqrs.cqrsbankingapp.service.transaction;

import com.cqrs.cqrsbankingapp.domain.model.Transaction;
import com.cqrs.cqrsbankingapp.service.CommandService;

public interface TransactionCommandService extends CommandService<Transaction> {
}
