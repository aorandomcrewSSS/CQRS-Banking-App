package com.cqrs.cqrsbankingapp.web.dto;

import com.cqrs.cqrsbankingapp.web.OnCreate;
import com.cqrs.cqrsbankingapp.web.OnUpdate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

import java.util.UUID;

public class CardDto {

    @NotNull(message = "id must be not null",
            groups = OnUpdate.class)
    @Null(message = "id must be null",
            groups = OnCreate.class)
    private UUID id;

    @NotBlank(message = "Card number must be not null",
            groups = OnCreate.class)
    @Null(message = "Card number must be null")
    private String number;

    @NotBlank(message = "Card date number must be not null",
            groups = OnCreate.class)
    @Null(message = "Card date number must be null")
    private String date;

    @NotBlank(message = "Card cvv number must be not null",
            groups = OnCreate.class)
    @Null(message = "Card cvv number must be null")
    private String cvv;

}
