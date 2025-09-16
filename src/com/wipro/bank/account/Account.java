package com.wipro.bank.account;

public abstract class Account {
    protected int tenure;
    protected float principal;
    protected float rateOfInterest;

    public Account() {
    }

    public Account(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    // Abstract method
    public abstract float calculateInterest();

    // Method to set interest rate
    public void setInterest(int age, String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            if (age >= 60) {
                rateOfInterest = 10.8f;
            } else {
                rateOfInterest = 9.8f;
            }
        } else if (gender.equalsIgnoreCase("Female")) {
            if (age >= 58) {
                rateOfInterest = 10.8f;
            } else {
                rateOfInterest = 10.2f;
            }
        }
    }
}
