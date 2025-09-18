package com.wipro.bank.main;
import com.wipro.bank.service.BankService;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Principle:");
    	float principal = sc.nextFloat();
    	
    	System.out.println("Enter the tenure:");
    	int tenure = sc.nextInt();
    	
    	System.out.println("Enter the gender:");
    	String gender = sc.next();
    	
    	System.out.println("Enter the age:");
    	int age= sc.nextInt();
    	
        BankService bank = new BankService();
        bank.calculate(principal, tenure, gender, age);
        
    }
}