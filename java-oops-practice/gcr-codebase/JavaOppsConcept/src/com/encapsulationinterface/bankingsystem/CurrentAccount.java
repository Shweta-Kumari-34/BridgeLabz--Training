package com.encapsulationinterface.bankingsystem;

	public class CurrentAccount extends BankAccount {

	    private static final double INTEREST_RATE = 0.01; // 1%

	    public CurrentAccount(String accNo, String name, double balance) {
	        super(accNo, name, balance);
	    }

	   
	    public double calculateInterest() {
	        return getBalance() * INTEREST_RATE;
	    }
	}

