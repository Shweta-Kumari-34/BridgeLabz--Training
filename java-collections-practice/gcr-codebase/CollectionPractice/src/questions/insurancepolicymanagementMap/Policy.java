package questions.insurancepolicymanagementMap;

public class Policy {
    String policyNumber;
    String policyholderName;
    String expiryDate;  // Using "YYYY-MM-DD" format for simplicity
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "[" + policyNumber + ", " + policyholderName + ", " + expiryDate + ", " + coverageType + ", " + premiumAmount + "]";
    }
}

