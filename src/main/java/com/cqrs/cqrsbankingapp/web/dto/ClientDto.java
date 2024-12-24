package com.cqrs.cqrsbankingapp.web.dto;

import com.cqrs.cqrsbankingapp.web.OnCreate;
import com.cqrs.cqrsbankingapp.web.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Getter
@Setter
public class ClientDto {

    @NotNull(message = "id must be not null",
            groups = OnUpdate.class)
    @Null(message = "id must be null",
            groups = OnCreate.class)
    private UUID id;

    @NotBlank(message = "name must be not null")
    @Length(min = 1,
            max = 255,
            message = "name can't be longer than 255 symbols")
    private String name;

    @Email(message = "username must be a valid email")
    @NotBlank(message = "username must be not null")
    @Length(min = 1,
            max = 255,
            message = "username can't be longer than 255 symbols")
    private String username;

    @NotBlank(message = "password must be not null")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
