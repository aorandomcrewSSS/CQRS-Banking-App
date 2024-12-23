package com.cqrs.cqrsbankingapp.service.card;

import com.cqrs.cqrsbankingapp.domain.model.Card;
import com.cqrs.cqrsbankingapp.service.CommandService;
import com.cqrs.cqrsbankingapp.service.QueryService;

public interface CardService extends QueryService<Card>, CommandService<Card> {

}
