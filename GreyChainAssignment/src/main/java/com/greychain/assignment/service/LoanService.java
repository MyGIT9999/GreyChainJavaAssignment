package com.greychain.assignment.service;


import com.greychain.assignment.entity.Aggregation;
import com.greychain.assignment.entity.LoanEntity;

import java.util.List;

public interface LoanService {

    public void save(LoanEntity loan);

    List<LoanEntity> findAll();

    LoanEntity findLoan(Integer loan_id);

    List<Aggregation> getData();
}
