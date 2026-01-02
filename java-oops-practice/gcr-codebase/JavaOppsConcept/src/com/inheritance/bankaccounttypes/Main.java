package com.inheritance.bankaccounttypes;

public class Main {
	public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount("SAV123", 50000, 4.5);
        CheckingAccount c1 = new CheckingAccount("CHK456", 25000, 20000);
        FixedDepositAccount f1 = new FixedDepositAccount("FD789", 100000, 12);

        s1.showDetails();
        s1.displayAccountType();

        c1.showDetails();
        c1.displayAccountType();

        f1.showDetails();
        f1.displayAccountType();
    }
}
