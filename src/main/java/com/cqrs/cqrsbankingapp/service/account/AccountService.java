package com.cqrs.cqrsbankingapp.service.account;

import com.cqrs.cqrsbankingapp.domain.model.Account;
import com.cqrs.cqrsbankingapp.service.CommandService;
import com.cqrs.cqrsbankingapp.service.QueryService;

public interface AccountService extends QueryService<Account>, CommandService<Account> {

}
