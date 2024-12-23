package com.cqrs.cqrsbankingapp.service.account;

import com.cqrs.cqrsbankingapp.domain.model.Account;
import com.cqrs.cqrsbankingapp.service.CommandService;

public interface AccountCommandService extends CommandService<Account> {
}
