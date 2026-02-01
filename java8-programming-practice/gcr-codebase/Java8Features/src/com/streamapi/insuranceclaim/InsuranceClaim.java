package com.streamapi.insuranceclaim;

public class InsuranceClaim {
    private String claimType;
    private double amount;

    public InsuranceClaim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Claim{" + "type='" + claimType + '\'' + ", amount=" + amount + '}';
    }
}

