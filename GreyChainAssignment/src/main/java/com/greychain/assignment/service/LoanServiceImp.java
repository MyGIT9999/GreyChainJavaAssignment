package com.greychain.assignment.service;

import com.greychain.assignment.dao.LoanRepository;
import com.greychain.assignment.entity.LoanEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LoanServiceImp implements LoanService{
    LoanRepository loanRepository;

    @Autowired

    public LoanServiceImp(LoanRepository theLoanRepository) {
        loanRepository = theLoanRepository;
    }

    @Override
    public void save(LoanEntity loan) {
        LocalDate paymentDate = loan.getPayment_date();
        LocalDate dueDate = loan.getDue_date();

        if (paymentDate.isBefore(dueDate)) {
            loanRepository.save(loan);
        } else {
            throw new RuntimeException("Payment date can not be greater than due date, The Loan is rejected");
        }

    }

    @Override
    public List<LoanEntity> findAll() {
       return loanRepository.findAll();
    }

    @Override
    public LoanEntity findLoan(Integer loan_id) {
        Optional<LoanEntity> result = loanRepository.findById(loan_id);
        LoanEntity loan = null;
        if (result.isPresent()) {
            loan = result.get();
        } else {
            throw new RuntimeException("Did not find employee id - " + loan_id);
        }

        return loan;
    }
}
