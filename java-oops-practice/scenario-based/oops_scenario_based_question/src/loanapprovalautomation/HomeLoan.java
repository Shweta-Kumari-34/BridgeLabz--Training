package loanapprovalautomation;

	public class HomeLoan extends LoanApplication implements IApprovable {

	    private int rate = 12; // annual %

	    HomeLoan(String loanType, int term) {
	        super(loanType, term);
	    }

	    @Override
	    public boolean approveLoan() {
	        return creditScore >= 700;
	    }

	    @Override
	    public double calculateEMI() {
	        double r = rate / (12.0 * 100); // monthly rate
	        return principal * r * Math.pow(1 + r, term)
	                / (Math.pow(1 + r, term) - 1);
	    }
	}


