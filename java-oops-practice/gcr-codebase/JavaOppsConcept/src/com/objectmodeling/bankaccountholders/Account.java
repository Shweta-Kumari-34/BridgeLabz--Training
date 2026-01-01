package com.objectmodeling.bankaccountholders;
public class Account {
	 private String accountNumber;
	    private double balance;

	    public Account(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("₹" + amount + " deposited. New Balance: ₹" + balance);
	    }

	    public void withdraw(double amount) {
	        if(amount <= balance) {
	            balance -= amount;
	            System.out.println("₹" + amount + " withdrawn. Remaining Balance: ₹" + balance);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }
	    public double getBalance() {
	        return balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }
	}


