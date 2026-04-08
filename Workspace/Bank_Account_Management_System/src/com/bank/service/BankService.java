package com.bank.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.bank.model.Transaction;

public class BankService {
	   private Map<Long, BankAccount> accounts = new HashMap<>();
	    private Set<String> customers = new HashSet<>();

	    // Create account
	    public void createAccount(long accNo, String name, double initialBalance) {
	        if (accounts.containsKey(accNo)) {
	            System.out.println("Account already exists: " + accNo);
	            return;
	        }
	        accounts.put(accNo, new BankAccount(accNo, name, initialBalance));
	        customers.add(name);
	        System.out.println("Account created for " + name);
	    }

	    // Deposit
	    public void deposit(long accNo, double amount) {
	        BankAccount acc = accounts.get(accNo);
	        if (acc != null) {
	            acc.deposit(amount);
	            System.out.println("Deposited ₹" + amount);
	        }
	    }

	    // Withdraw
	    public void withdraw(long accNo, double amount) {
	        BankAccount acc = accounts.get(accNo);
	        if (acc != null) {
	            if (acc.withdraw(amount)) {
	                System.out.println("Withdrawn ₹" + amount);
	            } else {
	                System.out.println("Insufficient balance");
	            }
	        }
	    }

	    // Transfer money
	    public void transfer(long fromAcc, long toAcc, double amount) {
	        BankAccount sender = accounts.get(fromAcc);
	        BankAccount receiver = accounts.get(toAcc);

	        if (sender == null || receiver == null) {
	            System.out.println("Invalid account");
	            return;
	        }

	        if (sender.withdraw(amount)) {
	            receiver.deposit(amount);
	            System.out.println("Transferred ₹" + amount);
	        } else {
	            System.out.println("Transfer failed: Insufficient balance");
	        }
	    }

	    // View account
	    public void showAccount(long accNo) {
	        System.out.println(accounts.get(accNo));
	    }

	    // Transaction history
	    public void showTransactions(long accNo) {
	        BankAccount acc = accounts.get(accNo);
	        System.out.println("\nTRANSACTIONS:");
	        for (Transaction t : acc.transactions) {
	            System.out.println(t);
	        }
	    }

}
