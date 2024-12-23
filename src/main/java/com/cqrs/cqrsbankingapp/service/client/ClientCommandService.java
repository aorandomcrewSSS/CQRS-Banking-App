package com.cqrs.cqrsbankingapp.service.client;

import com.cqrs.cqrsbankingapp.domain.model.Client;
import com.cqrs.cqrsbankingapp.service.CommandService;

public interface ClientCommandService extends CommandService<Client> {
}
