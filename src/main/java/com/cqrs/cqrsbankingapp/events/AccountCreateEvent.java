package com.cqrs.cqrsbankingapp.events;

import com.cqrs.cqrsbankingapp.domain.aggregate.Aggregate;
import com.cqrs.cqrsbankingapp.domain.model.Account;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountCreateEvent  extends AbstractEvent{
    public AccountCreateEvent(Account payload) {
        super(null,EventType.ACCOUNT_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
