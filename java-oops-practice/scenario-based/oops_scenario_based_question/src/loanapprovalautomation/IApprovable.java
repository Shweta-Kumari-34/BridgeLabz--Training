package loanapprovalautomation;

public interface IApprovable {
    boolean approveLoan();
    double calculateEMI();

    // setters used dynamically
    void setPrincipal(double principal);
    void setCreditScore(int creditScore);

    // getters needed in Main
    double getPrincipal();
    int getTenure();
}
