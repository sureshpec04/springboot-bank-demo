package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String>{

    List<Transaction> findAllBytransactionTsBetween(
            LocalDateTime startTimestamp,
            LocalDateTime endTimestamp);


}
