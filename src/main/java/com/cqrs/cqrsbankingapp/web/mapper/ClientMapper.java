package com.cqrs.cqrsbankingapp.web.mapper;

import com.cqrs.cqrsbankingapp.domain.model.Client;
import com.cqrs.cqrsbankingapp.web.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ClientMapper extends Mappable<Client, ClientDto> {

}
