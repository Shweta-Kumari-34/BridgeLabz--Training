package exceptions.banktransactionsystem;

public class BankAccount {

	    private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    // withdraw method
	    public void withdraw(double amount) throws InsufficientBalance{

	        if (amount < 0) {
	            throw new IllegalArgumentException("Invalid amount!");
	        }

	        if (amount > balance) {
	            throw new InsufficientBalance("Insufficient balance!");
	        }

	        balance -= amount;
	        System.out.println("Withdrawal successful, new balance: " + balance);
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

