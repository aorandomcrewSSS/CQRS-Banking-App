package com.cqrs.cqrsbankingapp.web.dto.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Card;
import com.cqrs.cqrsbankingapp.web.dto.modelDto.CardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface CardMapper extends Mappable<Card, CardDto> {

}
