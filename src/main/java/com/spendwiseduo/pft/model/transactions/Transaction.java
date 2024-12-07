package com.spendwiseduo.pft.model.transactions;

import java.time.LocalDateTime;

public class Transaction implements Comparable<Transaction> {
    protected int id;
    protected LocalDateTime date;
    protected int amount; // real_amount * 100
    protected int fee; // real_fee * 100
    protected int tax; // real_tax * 100
    protected String note;

    // currency

    protected Transaction(int id, LocalDateTime date, int amount, int fee, int tax, String note) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.fee = fee;
        this.tax = tax;
        this.note = note;
    }

    @Override
    public int compareTo(Transaction other) {
        return this.date.compareTo(other.date);
    }
}
