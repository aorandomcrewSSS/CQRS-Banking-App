package com.cqrs.cqrsbankingapp.repository;

import com.cqrs.cqrsbankingapp.events.AbstractEvent;
import com.cqrs.cqrsbankingapp.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends JpaRepository<AbstractEvent, Long> {

}
