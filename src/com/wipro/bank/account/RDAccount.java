package com.wipro.bank.account;

public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    public float calculateAmountDeposited() {
        return principal * tenure * 12; 
    }

    public float calculateInterest() {
        int n = 4;
        int t = tenure; 
        float r = rateOfInterest / 100;
        float amount = (float) (principal * (Math.pow((1 + r / n), n * t) - 1));
        return amount;
    }

 
    public float calculateMaturityAmount() {
        return calculateAmountDeposited() + calculateInterest();
    }
}
