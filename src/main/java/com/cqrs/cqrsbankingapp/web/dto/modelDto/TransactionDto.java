package com.cqrs.cqrsbankingapp.web.dto.modelDto;

import com.cqrs.cqrsbankingapp.web.dto.OnCreate;
import com.cqrs.cqrsbankingapp.web.dto.OnUpdate;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class TransactionDto {

    @NotNull(message = "id must be not null",
            groups = OnUpdate.class)
    @Null(message = "id must be null",
            groups = OnCreate.class)
    private UUID id;

    @NotNull(message = "card must be not null",
            groups = OnCreate.class)
    @Null(message = "Sender card must be null")
    @Valid
    private CardDto from;

    @NotNull(message = "card must be not null",
            groups = OnCreate.class)
    @Null(message = "Receiver card must be null")
    @Valid
    private CardDto to;

    @NotNull(message = "Amount must be not null")
    @Positive
    private BigDecimal amount;

}
