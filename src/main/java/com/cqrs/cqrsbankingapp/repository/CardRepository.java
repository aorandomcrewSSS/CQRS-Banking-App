package com.cqrs.cqrsbankingapp.repository;

import com.cqrs.cqrsbankingapp.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CardRepository extends JpaRepository<Card, UUID> {
    
}
