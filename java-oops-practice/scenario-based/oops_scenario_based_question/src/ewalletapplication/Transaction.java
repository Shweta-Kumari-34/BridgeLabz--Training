package ewalletapplication;


public	class Transaction {
	    private String type;
	    private double amount;

	    public Transaction(String type, double amount) {
	        this.type = type;
	        this.amount = amount;
	        System.out.println("Transaction: " + type + " | Amount: ₹" + amount);
	    }
	}


