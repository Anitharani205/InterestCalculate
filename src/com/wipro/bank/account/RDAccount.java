package com.wipro.bank.account;

public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    // Total amount deposited
    public float calculateAmountDeposited() {
        return principal * tenure * 12; // monthly deposit × 12 × years
    }

    // Interest (Quarterly Compounding)
    @Override
    public float calculateInterest() {
        int n = 4; // quarterly
        int t = tenure; 
        float r = rateOfInterest / 100;

        // Compound Interest formula
        float amount = (float) (principal * (Math.pow((1 + r / n), n * t) - 1));
        return amount;
    }

    // Maturity Amount
    public float calculateMaturityAmount() {
        return calculateAmountDeposited() + calculateInterest();
    }
}
