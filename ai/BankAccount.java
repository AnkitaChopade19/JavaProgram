package com.ai;

public abstract class BankAccount {
	
	/*1. Bank System (Abstract Class)
Create an abstract class BankAccount with:
abstract method calculateInterest()
concrete method displayBalance()  */
	
	public abstract void calculationInterest();
	
	public void displayBalance() {
		System.out.println("Account balance is 30000");
	}


}
