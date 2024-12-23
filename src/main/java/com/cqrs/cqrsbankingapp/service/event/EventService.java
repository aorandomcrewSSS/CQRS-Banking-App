package com.cqrs.cqrsbankingapp.service.event;

import com.cqrs.cqrsbankingapp.events.AbstractEvent;

public interface EventService {

    void create(AbstractEvent event);

}
