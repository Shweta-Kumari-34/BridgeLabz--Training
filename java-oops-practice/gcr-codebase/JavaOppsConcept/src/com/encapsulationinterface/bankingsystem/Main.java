package com.encapsulationinterface.bankingsystem;
import java.util.*;
public class Main {
	 
	    public static void main(String[] args) {

	        List<BankAccount> accounts = new ArrayList<>();

	        BankAccount acc1 = new SavingsAccount("SB100234", "Amit Kumar", 50000);
	        BankAccount acc2 = new CurrentAccount("CA200567", "Neha Sharma", 120000);

	        accounts.add(acc1);
	        accounts.add(acc2);

	        System.out.println();

	        for (BankAccount acc : accounts) {
	            acc.deposit(5000);
	            acc.withdraw(3000);
	            acc.displayAccountDetails();  
	        }

	        if (acc1 instanceof Loanable) {
	            Loanable loanAcc = (Loanable) acc1;
	            loanAcc.applyForLoan(200000);
	            System.out.println("Loan Eligibility: ₹" + loanAcc.calculateLoanEligibility());
	        }
	    
	}

}
