package hospitalpatientmanagementsystem;


	public class Bill implements Payable {
	    private double baseAmount;
	    private double taxRate = 0.05;   // 5% tax
	    private double discount = 500;   // flat discount

	    public Bill(double baseAmount) {
	        this.baseAmount = baseAmount;
	    }

	    @Override
	    public double calculatePayment() {
	        double tax = baseAmount * taxRate;
	        return baseAmount + tax - discount; // Operators used
	    }
	}


