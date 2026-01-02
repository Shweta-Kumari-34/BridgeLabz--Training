package com.encapsulationinterface.bankingsystem;


	public class SavingsAccount extends BankAccount implements Loanable {

	    private static final double INTEREST_RATE = 0.04; // 4%

	    public SavingsAccount(String accNo, String name, double balance) {
	        super(accNo, name, balance);
	    }
	
	    public double calculateInterest() {
	        return getBalance() * INTEREST_RATE;
	    }

	
	    public void applyForLoan(double amount) {
	        System.out.println("Loan applied for ₹" + amount + " (Savings Account)");
	    }

	    public double calculateLoanEligibility() {
	        return getBalance() * 5;
	    }
	}

