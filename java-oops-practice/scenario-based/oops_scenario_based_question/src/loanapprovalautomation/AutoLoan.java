package loanapprovalautomation;

//public class AutoLoan extends LoanApplication  {
//private int rate =10;
//	AutoLoan(String loanType, int term, int interestRate ){
//		super(loanType, term);
//	}
//	
//	public boolean approveLoan( int creditScore) {
//		if ( creditScore >=700 && creditScore <=749 ) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	public double calculateEMI( double principal,  int tenure) {
//		double amountEMI= principal * rate *(Math.pow((1+ rate), tenure))/(Math.pow((1+rate), tenure-1));
//		return amountEMI;
//	}
//	
	
	
//}

//package loanapprovalautomation;

public class AutoLoan extends LoanApplication implements IApprovable {

    private int rate = 10; // annual %

    AutoLoan(String loanType, int term) {
        super(loanType, term);
    }

    @Override
    public boolean approveLoan() {
        return creditScore >= 650;
    }

    @Override
    public double calculateEMI() {
        double r = rate / (12.0 * 100);
        return principal * r * Math.pow(1 + r, term)
                / (Math.pow(1 + r, term) - 1);
    }
}

