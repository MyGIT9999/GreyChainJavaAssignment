package com.greychain.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name="users_loan")
public class LoanEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="loan_id")
    private int loan_id;

    @Column(name="customer_id")
    private int customer_id;

    @Column(name="lender_id")
    private int lender_id;

    @Column(name="amount")
    private int amount;

    @Column(name="payment_date")
    private LocalDate payment_date;

    @Column(name="interest_rate")
    private int interest_rate;

    @Column(name="due_date")
    private LocalDate due_date;

    @Column(name="penalty")
    private int penalty;


    public LoanEntity(){}


    public LoanEntity(int customer_id, int lender_id, int amount, LocalDate payment_date, int interest_rate, LocalDate due_date, int penalty) {
        this.customer_id = customer_id;
        this.lender_id = lender_id;
        this.amount = amount;
        this.payment_date = payment_date;
        this.interest_rate = interest_rate;
        this.due_date = due_date;
        this.penalty = penalty;
    }

    public int getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getLender_id() {
        return lender_id;
    }

    public void setLender_id(int lender_id) {
        this.lender_id = lender_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(LocalDate payment_date) {
        this.payment_date = payment_date;
    }

    public int getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(int interest_rate) {
        this.interest_rate = interest_rate;
    }

    public LocalDate getDue_date() {
        return due_date;
    }

    public void setDue_date(LocalDate due_date) {
        this.due_date = due_date;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        return "LoanEntity{" +
                "loan_id=" + loan_id +
                ", customer_id=" + customer_id +
                ", lender_id=" + lender_id +
                ", amount=" + amount +
                ", payment_date=" + payment_date +
                ", interest_rate=" + interest_rate +
                ", due_date=" + due_date +
                ", penalty=" + penalty +
                '}';
    }
}
