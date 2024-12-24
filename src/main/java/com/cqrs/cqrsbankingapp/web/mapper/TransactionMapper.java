package com.cqrs.cqrsbankingapp.web.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Transaction;
import com.cqrs.cqrsbankingapp.web.dto.TransactionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TransactionMapper extends Mappable<Transaction, TransactionDto> {

}
