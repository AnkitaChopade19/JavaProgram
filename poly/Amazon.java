package com.poly;

public class Amazon {
	
	void orderPlaced(String name) {
		System.out.println("Product name = "+ name);
	}
	void orderPlaced(String name,int price) {
		System.out.println("Product name = "+ name + "Price = " +price);
	}
	void orderPlaced(String name,int price, int quantity) {
		System.out.println("Product name = "+ name + "Price = " +price + "Quntity is = " + quantity);
	}
}
