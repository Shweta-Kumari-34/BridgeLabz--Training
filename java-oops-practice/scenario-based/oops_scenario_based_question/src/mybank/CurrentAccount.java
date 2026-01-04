package mybank;


	class CurrentAccount extends Account {

	    private double interestRate = 1.0; 

	    public CurrentAccount(int accountNumber) {
	        super(accountNumber);
	    }

	    public double calculateInterest() {
	        return getBalance() * interestRate / 100;
	    }
	}


