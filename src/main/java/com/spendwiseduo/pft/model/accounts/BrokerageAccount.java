package com.spendwiseduo.pft.model.accounts;

import com.spendwiseduo.pft.model.transactions.BrokerageTransaction;
import java.util.SortedSet;
import java.util.TreeSet;

public class BrokerageAccount extends Account {
    private SortedSet<BrokerageTransaction> transactionList;

    public BrokerageAccount(int id, String name) {
        super(id, name);
        transactionList = new TreeSet<>();
    }
}
