package com.constructors.level1;

public class BankAccount {
	 public String accountNumber;      
	    protected String accountHolder;   
	    private double balance;           

	    // Constructor
	    public BankAccount(String accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }
	   
		public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return this.balance;
	    }
	    public void displayAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }
	    
}
