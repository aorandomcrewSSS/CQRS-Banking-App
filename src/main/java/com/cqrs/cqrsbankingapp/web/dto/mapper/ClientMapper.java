package com.cqrs.cqrsbankingapp.web.dto.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Client;
import com.cqrs.cqrsbankingapp.web.dto.modelDto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ClientMapper extends Mappable<Client, ClientDto> {

}
