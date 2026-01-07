package loanapprovalautomation;

public class LoanApplication {

	    protected String loanType;
	    protected int term;
	    protected int rate;
	    protected double principal;
	    protected int creditScore;

	    LoanApplication(String loanType, int term) {
	        this.loanType = loanType;
	        this.term = term;
	    }

	    public void setPrincipal(double principal) {
	        this.principal = principal;
	    }

	    public void setCreditScore(int creditScore) {
	        this.creditScore = creditScore;
	    }

	    public double getPrincipal() {
	        return principal;
	    }

	    public int getTenure() {
	        return term;
	    }
	}


