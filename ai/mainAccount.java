package com.ai;

public class mainAccount {
	
	public static void main(String args[]) {
		
		BankAccount b = new savingAccount();
		b.calculationInterest();
		b.displayBalance();
		
		System.out.println("-------------------------");
		
		b = new currentAccount();
		b.calculationInterest();
		b.displayBalance();
		
	}

}
