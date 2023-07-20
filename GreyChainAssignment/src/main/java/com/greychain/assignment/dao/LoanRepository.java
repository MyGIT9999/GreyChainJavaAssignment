package com.greychain.assignment.dao;

import com.greychain.assignment.entity.Aggregation;
import com.greychain.assignment.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanRepository extends JpaRepository<LoanEntity, Integer> {
    @Query("SELECT new com.greychain.assignment.entity.Aggregation(l.customer_id, l.lender_id, COUNT(l.amount), COUNT(l.interest_rate), COUNT(l.penalty)) "
            + "FROM LoanEntity AS l GROUP BY l.customer_id, l.lender_id")
    List<Aggregation> getAggregateData();
}
