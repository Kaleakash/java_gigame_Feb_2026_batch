package com.bank.main;

import com.bank.service.BankService;

public class BankApp {

    public static void main(String[] args) {

        BankService bank = new BankService();

        // Create accounts
        bank.createAccount(1001, "Alice", 5000);
        bank.createAccount(1002, "Bob", 3000);

        // Operations
        bank.deposit(1001, 2000);
        bank.withdraw(1001, 1000);
        bank.transfer(1001, 1002, 1500);

        // Reports
        bank.showAccount(1001);
        bank.showAccount(1002);

        bank.showTransactions(1001);
    }
}

