package ewalletapplication;


	class BusinessWallet extends Wallet {

	    public BusinessWallet(double referralBonus) {
	        super(referralBonus);
	    }

	  
	    public void transferTo(User receiver, double amount) {
	        double tax = amount * 0.02; // 2% transaction tax
	        double totalDeduction = amount + tax;

	        if (totalDeduction <= getBalance()) {
	            deductBalance(totalDeduction);
	            receiver.getWallet().addBalance(amount);
	            new Transaction("Business Transfer", amount);
	        } else {
	            System.out.println("Insufficient balance in Business Wallet");
	        }
	    }
	}


