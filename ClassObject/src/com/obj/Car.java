package com.obj;

public class Car {
	
	int modelYr;
	String clr;
	int prize;
	
	public static void main(String args[]) {
		
		Car bmw = new Car();
		System.out.println("BMW car Model yr =  " + (bmw.modelYr = 2014));
		System.out.println(bmw.prize = 456000);
		System.out.println(bmw.clr = "red");
		
		System.out.println("----------------------------");
		
		Car alto = new Car();
		System.out.println("alto car Model yr =  " + (alto.modelYr = 2015));
		System.out.println(alto.prize = 447800);
		System.out.println(alto.clr = "black");

		System.out.println("----------------------------");

		Car Swift = new Car();
		System.out.println("Swift car Model yr =  " + (Swift.modelYr = 2023));
		System.out.println(Swift.prize = 1000000);
		System.out.println(Swift.clr = "white");

		System.out.println("----------------------------");

		Car s2 = new Car();
		System.out.println("S2 car Model yr =  " + (s2.modelYr = 2022));
		System.out.println(s2.prize = 150000);
		System.out.println(s2.clr = "blue");
	}

}
