package com.kedai.kedaibe.repository;

import com.kedai.kedaibe.entity.order.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
