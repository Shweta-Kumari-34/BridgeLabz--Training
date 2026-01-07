//package loanapprovalautomation;
//
//public class HomeLoan extends LoanApplication implements IApprovable {
//private int rate =12;
//	HomeLoan(String loanType, int term ){
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
//	public  double calculateEMI( double principal,  int tenure) {
//		double amountEMI= principal * rate *(Math.pow((1+ rate), tenure))/(Math.pow((1+rate), tenure-1));
//		return amountEMI;
//	}
//	public void displayrepaymentPlan( ) {
//	System.out.println("principal amount is ")	;
//	}
//	
//}
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
