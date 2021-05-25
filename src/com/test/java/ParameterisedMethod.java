package com.test.java;

public class ParameterisedMethod {

	double amountWithdrawl(int x){		//Passing parameters in the method
		currentBalance();
		System.out.println("Amount Withdrawl "+x);
		return 0;
	}
	double currentBalance(){
		double currentbal = 1000;
		System.out.println("Current balance "+currentbal );
		return currentbal;			//'return' keyword is used for the further usage of the return value
	}
	
	public static void main(String[] args) {
		ParameterisedMethod Obj = new ParameterisedMethod();
		Obj.amountWithdrawl(200);	// Assigning values to parameter in the method

	}

}
