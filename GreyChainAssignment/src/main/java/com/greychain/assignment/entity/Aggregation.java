package com.greychain.assignment.entity;

import jakarta.persistence.Column;

public class Aggregation {

    private int amount;
    private int interest_rate;
    private int penalty;
    private int lender_id;
    private int customer_id;

    public Aggregation(int amount, int interest_rate, int penalty, int lender_id, int customer_id) {
        this.amount = amount;
        this.interest_rate = interest_rate;
        this.penalty = penalty;
        this.lender_id = lender_id;
        this.customer_id = customer_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(int interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getLender_id() {
        return lender_id;
    }

    public void setLender_id(int lender_id) {
        this.lender_id = lender_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
