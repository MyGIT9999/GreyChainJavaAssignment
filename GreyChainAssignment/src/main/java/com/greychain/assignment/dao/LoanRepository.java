package com.greychain.assignment.dao;

import com.greychain.assignment.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanEntity, Integer> {

}
