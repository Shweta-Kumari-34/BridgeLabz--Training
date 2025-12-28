package com.constructors.level1;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(String accountNumber, String accountHolder, double balance) {

		// calling Student class constructor
		super("12345678", "Prashant Srivastava", 99999999999.9 );
			}
			
			public void showSavingsAccountDetails() {
				//accessing the protected member of parent class
				System.out.println("Account Number is: "+ accountNumber);	
				System.out.println("Account Holder is : "+ accountHolder);	
				super.displayAccountDetails();
			}
}
