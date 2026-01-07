package loanapprovalautomation;

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

