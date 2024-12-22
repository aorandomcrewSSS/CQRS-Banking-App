package com.cqrs.cqrsbankingapp.events;

import com.cqrs.cqrsbankingapp.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);
}
