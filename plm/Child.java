package com.plm;

public class Child extends Parent {
	void details(String name, int id , String city) {
		System.out.println("-----------Child Details------------");
		System.out.println("name = " + name+ " id = " + id + " city = " + city);
	}
	void bankName(String bankName) {
		System.out.println("Bank name = " + bankName);
	}
}
