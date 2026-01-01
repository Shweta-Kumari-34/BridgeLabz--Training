package com.objectmodeling.bankaccountholders;

import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Bank opens account for customer
    public void openAccount(Customer customer, String accNo, double initialAmount) {
        Account newAccount = new Account(accNo, initialAmount);
        customer.addAccount(newAccount);
        System.out.println("Account " + accNo + " opened in " + bankName + " for " + customer);
    }

    public void showCustomers() {
        System.out.println("\nBank: " + bankName + " Customers List:");
        for(Customer c : customers) {
            System.out.println("- " + c);
        }
    }
}
