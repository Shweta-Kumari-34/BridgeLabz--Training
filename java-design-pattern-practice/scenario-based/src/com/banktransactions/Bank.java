package com.banktransactions;
import java.util.HashMap;
import java.util.Map;

class Bank {

    // Stores accountNumber -> balance
    private Map<Integer, Integer> accounts = new HashMap<>();

    // Constructor to initialize accounts
    public Bank() {
        accounts.put(101, 1000);
        accounts.put(102, 2000);
        accounts.put(103, 3000);
    }

    // Synchronized deposit method
    public synchronized void deposit(int accountNumber, int amount) {
        int currentBalance = accounts.get(accountNumber);
        currentBalance += amount;
        accounts.put(accountNumber, currentBalance);

        System.out.println(Thread.currentThread().getName() +
                " deposited " + amount +
                " | Account: " + accountNumber +
                " | New Balance: " + currentBalance);
    }

    // Synchronized withdraw method
    public synchronized void withdraw(int accountNumber, int amount) {
        int currentBalance = accounts.get(accountNumber);

        if (currentBalance >= amount) {
            currentBalance -= amount;
            accounts.put(accountNumber, currentBalance);

            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount +
                    " | Account: " + accountNumber +
                    " | New Balance: " + currentBalance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " tried to withdraw " + amount +
                    " | Account: " + accountNumber +
                    " | Insufficient Balance");
        }
    }

    // Synchronized balance check
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
