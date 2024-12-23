package com.cqrs.cqrsbankingapp.service.event;

import com.cqrs.cqrsbankingapp.events.AbstractEvent;
import com.cqrs.cqrsbankingapp.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    @Override
    public void create(AbstractEvent event) {
        repository.save(event);
    }
}
