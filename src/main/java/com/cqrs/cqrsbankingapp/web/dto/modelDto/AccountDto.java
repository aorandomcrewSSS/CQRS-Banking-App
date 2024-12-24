package com.cqrs.cqrsbankingapp.web.dto.modelDto;

import com.cqrs.cqrsbankingapp.web.dto.OnCreate;
import com.cqrs.cqrsbankingapp.web.dto.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class AccountDto {

    @NotNull(message = "id must be not null",
            groups = OnUpdate.class)
    @Null(message = "id must be null",
            groups = OnCreate.class)
    private UUID id;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String number;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private BigDecimal balance;

}
