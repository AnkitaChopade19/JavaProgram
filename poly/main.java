package com.poly;

public class main {
	
	public static void main(String args[]) {
		Amazon a = new Amazon();
		
		a.orderPlaced("Vivo Y37");
		a.orderPlaced("Vivo Y37", 35000);
		a.orderPlaced("Vivo Y37", 35000, 1);
	}

}
