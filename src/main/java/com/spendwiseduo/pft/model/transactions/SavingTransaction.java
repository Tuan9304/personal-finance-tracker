package com.spendwiseduo.pft.model.transactions;

import com.spendwiseduo.pft.model.accounts.SavingAccount;
import com.spendwiseduo.pft.model.accounts.TransactionAccount;
import com.spendwiseduo.pft.model.transactions.type.SavingTransactionType;
import java.time.LocalDateTime;

public class SavingTransaction extends Transaction {
    private SavingTransactionType type;
    private SavingAccount savingAccount;
    private TransactionAccount transactionAccount;

    public SavingTransaction(
            int id,
            LocalDateTime date,
            SavingAccount savingAccount,
            TransactionAccount transactionAccount,
            SavingTransactionType type,
            int amount,
            int fee,
            int tax,
            String note) {
        super(id, date, amount, fee, tax, note);
        this.savingAccount = savingAccount;
        this.transactionAccount = transactionAccount;
        this.type = type;
    }
}
