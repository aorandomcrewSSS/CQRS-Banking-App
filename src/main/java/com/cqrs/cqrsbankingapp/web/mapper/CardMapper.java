package com.cqrs.cqrsbankingapp.web.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Card;
import com.cqrs.cqrsbankingapp.web.dto.CardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface CardMapper extends Mappable<Card, CardDto> {

}
