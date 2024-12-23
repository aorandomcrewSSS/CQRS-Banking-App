package com.cqrs.cqrsbankingapp.service.transaction;

import com.cqrs.cqrsbankingapp.domain.model.Transaction;
import com.cqrs.cqrsbankingapp.service.CommandService;
import com.cqrs.cqrsbankingapp.service.QueryService;

public interface TransactionService extends QueryService<Transaction>, CommandService<Transaction> {

}
