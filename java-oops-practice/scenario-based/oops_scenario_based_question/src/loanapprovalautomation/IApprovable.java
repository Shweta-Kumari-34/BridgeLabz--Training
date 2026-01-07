package loanapprovalautomation;

	public interface IApprovable {
	    boolean approveLoan();
	    double calculateEMI();

	    // setters 
	    void setPrincipal(double principal);
	    void setCreditScore(int creditScore);

	    // getters 
	    double getPrincipal();
	    int getTenure();
	}


