package com.greychain.assignment.controller;

import com.greychain.assignment.entity.LoanEntity;
import com.greychain.assignment.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/loan")
public class LoneController {
    LoanService loanService;

    @Autowired
    public LoneController(LoanService theService) {
        loanService = theService;
    }

    @GetMapping("/list")
    public List<LoanEntity> listEmployees() {

        List<LoanEntity> usersLoan = loanService.findAll();

        return usersLoan;
    }

    @PostMapping("/save")
    public String save( LoanEntity loan) {
        loanService.save(loan);
        return "Loan approved !";
    }
}
