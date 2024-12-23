package com.cqrs.cqrsbankingapp.service.card;

import com.cqrs.cqrsbankingapp.domain.model.Card;
import com.cqrs.cqrsbankingapp.service.CommandService;

public interface CardCommandService extends CommandService<Card> {
}
