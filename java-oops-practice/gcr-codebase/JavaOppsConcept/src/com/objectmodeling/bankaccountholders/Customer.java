package com.objectmodeling.bankaccountholders;

import java.util.ArrayList;


public class Customer {
	
	    private String name;
	    private ArrayList<Account> accounts = new ArrayList<>();

	    public Customer(String name) {
	        this.name = name;
	    }

	    // Customer adds account
	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    // View total accounts & balance
	    public void viewBalance() {
	        System.out.println("\nCustomer: " + name + " Accounts:");
	        for(Account acc : accounts) {
	            System.out.println("Account No: " + acc.getAccountNumber() +
	                               " | Balance: ₹" + acc.getBalance());
	        }
	    }
	}

