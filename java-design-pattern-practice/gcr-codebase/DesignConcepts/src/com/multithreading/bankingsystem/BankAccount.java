package com.multithreading.bankingsystem;

public class BankAccount {

    private int balance = 10000; // initial balance

    // withdraw method (NOT synchronized intentionally)
    public boolean withdraw(int amount) {

        if (balance >= amount) {
            // simulate delay
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance - amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
}

