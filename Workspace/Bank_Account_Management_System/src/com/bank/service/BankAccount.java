package com.bank.service;

import java.util.*;

import com.bank.model.Transaction;

public class BankAccount {
    long accountNumber;
    String customerName;
    double balance;
    List<Transaction> transactions = new ArrayList<>();

    BankAccount(long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount));
    }

    boolean withdraw(double amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
        return true;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber +
               " | Name: " + customerName +
               " | Balance: ₹" + balance;
    }
}

