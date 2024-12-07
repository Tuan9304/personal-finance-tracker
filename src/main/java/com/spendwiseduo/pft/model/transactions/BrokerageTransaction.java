package com.spendwiseduo.pft.model.transactions;

import com.spendwiseduo.pft.model.accounts.BrokerageAccount;
import com.spendwiseduo.pft.model.accounts.TransactionAccount;
import com.spendwiseduo.pft.model.assets.Asset;
import com.spendwiseduo.pft.model.transactions.type.BrokerageTransactionType;
import java.time.LocalDateTime;

public class BrokerageTransaction extends Transaction {
    private BrokerageTransactionType type;
    private Asset asset;
    private BrokerageAccount brokerageAccount;
    private TransactionAccount transactionAccount;
    private long shares; // real_shares * 10^8
    private int quote; // real_quote * 100

    public BrokerageTransaction(
            int id,
            LocalDateTime date,
            BrokerageAccount brokerageAccount,
            TransactionAccount transactionAccount,
            BrokerageTransactionType type,
            Asset asset,
            long shares,
            int amount,
            int fee,
            int tax,
            String note) {
        super(id, date, amount, fee, tax, note);
        this.brokerageAccount = brokerageAccount;
        this.transactionAccount = transactionAccount;
        this.type = type;
        this.asset = asset;
        this.shares = shares;
    }
}
