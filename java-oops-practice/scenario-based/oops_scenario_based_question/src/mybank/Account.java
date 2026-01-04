package mybank;


public	abstract class Account implements ITransaction {

	    protected int accountNumber;
	    private double balance;

	    public Account(int accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0;
	    }

	    public Account(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Amount deposited: " + amount);
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Amount withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    public double checkBalance() {
	        return balance;
	    }

	    protected double getBalance() {
	        return balance;
	    }

	    public abstract double calculateInterest();
	}

