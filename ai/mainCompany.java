package com.ai;

public class mainCompany {
	
	public static void main(String args[]) {
		
		Employee e = new FullTimeEmployee();
		e.calculateSalary();
		
		System.out.println("-----------------");
		
		e = new PartTimeEmployee();
		e.calculateSalary();
	}

}
