package com.spendwiseduo.pft.model.accounts;

import com.spendwiseduo.pft.model.transactions.DailyTransaction;
import java.util.SortedSet;
import java.util.TreeSet;

public class TransactionAccount extends Account {
    private SortedSet<DailyTransaction> transactionList;

    public TransactionAccount(int id, String name) {
        super(id, name);
        transactionList = new TreeSet<>();
    }
}
