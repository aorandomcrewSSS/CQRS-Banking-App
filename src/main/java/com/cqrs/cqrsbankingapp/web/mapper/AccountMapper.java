package com.cqrs.cqrsbankingapp.web.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Account;
import com.cqrs.cqrsbankingapp.web.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface AccountMapper extends Mappable<Account, AccountDto> {

}
