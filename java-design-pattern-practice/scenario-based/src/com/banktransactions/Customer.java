package com.banktransactions;
class Customer extends Thread {

    private Bank bank;
    private int accountNumber;

    public Customer(Bank bank, int accountNumber, String name) {
        super(name);  
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {

        bank.deposit(accountNumber, 500);
        bank.withdraw(accountNumber, 300);
        bank.withdraw(accountNumber, 700);
        bank.deposit(accountNumber, 200);
    }
}
