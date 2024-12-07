package com.spendwiseduo.pft.model.accounts;

public class Account {
    protected int id;
    protected String name;
    protected int balance; // real_balance * 100

    // currency

    protected Account(int id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }
}
