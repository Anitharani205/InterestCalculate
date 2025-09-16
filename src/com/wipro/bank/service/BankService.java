package com.wipro.bank.service;

import com.wipro.bank.account.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {

    public boolean validateData(float principal, int tenure, int age, String gender) throws BankValidationException {
        if (principal >= 500 &&
            (age >= 1 && age <= 100) &&
            (tenure == 5 || tenure == 10) &&
            (gender.equals("Male") || gender.equals("Female"))) {
            return true;
        } else {
            throw new BankValidationException();
        }
    }

 
    public void calculate(float principal, int age, String gender, int tenure) {
        try {
            if (validateData(principal, tenure, age, gender)) {
                RDAccount acc = new RDAccount(tenure, principal);

           
                acc.setInterest(age, gender);

              
                System.out.println("Amount Deposited: " + acc.calculateAmountDeposited());
                System.out.println("Interest Earned: " + acc.calculateInterest());
           
            }
        } catch (BankValidationException e) {
            System.out.println("invalid");
        }
    }
}
