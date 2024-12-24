package com.cqrs.cqrsbankingapp.web.dto.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Transaction;
import com.cqrs.cqrsbankingapp.web.dto.modelDto.TransactionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TransactionMapper extends Mappable<Transaction, TransactionDto> {

}
