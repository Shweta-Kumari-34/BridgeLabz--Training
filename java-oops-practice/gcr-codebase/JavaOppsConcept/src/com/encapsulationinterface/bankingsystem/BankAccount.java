package com.encapsulationinterface.bankingsystem;


public	abstract class BankAccount {

	    private String accountNumber;
	    private String holderName;
	    private double balance;

	    public BankAccount(String accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	    public String getAccountNumber() {
	        return "XXXXXX" + accountNumber.substring(accountNumber.length() - 4);
	    }

	    public String getHolderName() {
	        return holderName;
	    }

	    protected double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }

	    public abstract double calculateInterest();
    
	    public void displayAccountDetails() {
	        System.out.println("-------------------------------------");
	        System.out.println("Account No: " + getAccountNumber());
	        System.out.println("Holder Name: " + holderName);
	        System.out.println("Balance: ₹" + balance);
	        System.out.println("Interest: ₹" + calculateInterest());
	    }
	}


