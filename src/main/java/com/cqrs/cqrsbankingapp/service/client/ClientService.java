package com.cqrs.cqrsbankingapp.service.client;

import com.cqrs.cqrsbankingapp.domain.model.Client;
import com.cqrs.cqrsbankingapp.service.CommandService;
import com.cqrs.cqrsbankingapp.service.QueryService;

public interface ClientService extends QueryService<Client>, CommandService<Client> {

}
