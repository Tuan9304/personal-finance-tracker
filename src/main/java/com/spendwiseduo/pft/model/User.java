package com.spendwiseduo.pft.model;

import com.spendwiseduo.pft.model.accounts.Account;
import com.spendwiseduo.pft.model.assets.Asset;
import com.spendwiseduo.pft.model.transactions.Transaction;
import java.util.ArrayList;
import java.util.List;

public class User {
    private static int idCount = 0;
    private int id;
    private int transactionCount;
    private int accountCount;
    private int assetCount;
    private String username;
    private String name;
    private List<Transaction> transactionList;
    private List<Account> accountList;
    private List<Asset> assetList;

    public User(String username, String name) {
        id = idCount;
        transactionCount = 0;
        accountCount = 0;
        this.username = username;
        this.name = name;
        transactionList = new ArrayList<>();
        accountList = new ArrayList<>();
        assetList = new ArrayList<>();

        idCount++;
    }
}
