package com.wipro.bank.account;

public abstract class Account {
    protected int tenure;
    protected float principal;
    protected float rateOfInterest;


  
    public abstract float calculateInterest();

    
    public void setInterest(int age, String gender) {
        if (gender.equals("Male")) {
            if (age >= 60) {
            	
               this. rateOfInterest = 10.8f;
            } else {
                this.rateOfInterest = 9.8f;
            }
        } else if (gender.equals("Female")) {
            if (age >= 58) {
                this.rateOfInterest = 10.8f;
            } else {
                this.rateOfInterest = 10.2f;
            }
        }
    }
}
