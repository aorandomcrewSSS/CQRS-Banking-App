package com.cqrs.cqrsbankingapp.web.dto.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Account;
import com.cqrs.cqrsbankingapp.web.dto.modelDto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface AccountMapper extends Mappable<Account, AccountDto> {

}
