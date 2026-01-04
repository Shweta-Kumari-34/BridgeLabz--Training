package mybank;

public class Main {

	    public static void main(String[] args) {

	        Account savings = new SavingsAccount(101, 10000);
	        Account current = new CurrentAccount(102);

	        savings.deposit(2000);
	        savings.withdraw(1000);

	        current.deposit(5000);

	        System.out.println("Savings Balance: " + savings.checkBalance());
	        System.out.println("Savings Interest: " + savings.calculateInterest());

	        System.out.println("Current Balance: " + current.checkBalance());
	        System.out.println("Current Interest: " + current.calculateInterest());
	    }
	}


