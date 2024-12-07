package com.spendwiseduo.pft.model.accounts;

import com.spendwiseduo.pft.model.transactions.SavingTransaction;
import java.util.SortedSet;
import java.util.TreeSet;

public class SavingAccount extends Account {
    private SortedSet<SavingTransaction> transactionList;
    private int apy; // real_APY * 100

    public SavingAccount(int id, String name, int apy) {
        super(id, name);
        this.apy = apy;
        transactionList = new TreeSet<>();
    }

    public void setAPY(int apy) {
        this.apy = apy;
    }
}
