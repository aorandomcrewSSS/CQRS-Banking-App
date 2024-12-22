package com.cqrs.cqrsbankingapp.repository;

import com.cqrs.cqrsbankingapp.domain.model.Account;
import com.cqrs.cqrsbankingapp.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<Card, UUID> {
    
}
