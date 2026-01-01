package com.objectmodeling.bankaccountholders;


public class Main{
public static void main(String[] args) {

    Bank bank1 = new Bank("State Bank of India");
    Bank bank2 = new Bank("Punjab National Bank");

    Customer c1 = new Customer("Amit Kumar");
    Customer c2 = new Customer("Preeti Sharma");

    bank1.addCustomer(c1);
    bank2.addCustomer(c2);

    // Accounts opened in banks
    bank1.openAccount(c1, "SBI101", 5000);
    bank1.openAccount(c1, "SBI102", 8000);

    bank2.openAccount(c2, "PNB201", 10000);

    // Customers check account balance
    c1.viewBalance();
    c2.viewBalance();
}
}


