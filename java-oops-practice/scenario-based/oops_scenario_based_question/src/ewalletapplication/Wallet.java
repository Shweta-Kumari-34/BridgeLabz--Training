package ewalletapplication;


public 	abstract class Wallet implements Transferrable {
	    private double balance;

	   
	    public Wallet() {
	        this.balance = 0;
	    }

	   
	    public Wallet(double referralBonus) {
	        this.balance = referralBonus;
	    }

	    
	    public double getBalance() {
	        return balance;
	    }

	    protected void addBalance(double amount) {
	        balance += amount;
	    }

	    protected void deductBalance(double amount) {
	        balance -= amount;
	    }

	    public void loadMoney(double amount) {
	        addBalance(amount);
	    }
	}

