package com.spendwiseduo.pft.model.transactions;

import com.spendwiseduo.pft.model.accounts.TransactionAccount;
import com.spendwiseduo.pft.model.transactions.type.DailyTransactionType;
import java.time.LocalDateTime;

public class DailyTransaction extends Transaction {
    private DailyTransactionType type;
    private TransactionAccount transactionAccount;

    // category
    //

    public DailyTransaction(
            int id,
            LocalDateTime date,
            TransactionAccount transactionAccount,
            DailyTransactionType type,
            int amount,
            int fee,
            int tax,
            String note) {
        super(id, date, amount, fee, tax, note);
        this.type = type;
        this.transactionAccount = transactionAccount;
        // this.category = category;
    }
}
