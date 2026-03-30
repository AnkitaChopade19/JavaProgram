package com.methods;

public class MainCalculator {
	public static void main(String args[]) {
		
		Calculator c1 = new Calculator();
		
		System.out.println("Addition ="+ c1.myAddition());
		System.out.println("Substraction =" + c1.mySubstraction());
		System.out.println("Multiplication =" + c1.myMultiplication());
		System.out.println("Division =" + c1.myDivision());
	}

}
