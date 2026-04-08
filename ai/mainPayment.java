package com.ai;

public class mainPayment {
	public static void main(String args[]) {
		
		Payment p = new CreditCardPayment();
		p.pay();
		
		System.out.println("-------------------");
		
		p = new UPIPayment();
		p.pay();
		
		System.out.println("--------------------");
		
		p = new NetBanking();
		p.pay();
	}

}
