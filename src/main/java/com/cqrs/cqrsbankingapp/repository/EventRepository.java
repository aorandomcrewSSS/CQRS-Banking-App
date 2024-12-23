package com.cqrs.cqrsbankingapp.repository;

import com.cqrs.cqrsbankingapp.events.AbstractEvent;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EventRepository extends JpaRepository<AbstractEvent, Long> {

}
