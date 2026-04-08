package com.ai;

public class mainShape {
	
	public static void main(String args[]) {
		
		ShapeAreaCal s = new circle();
		s.area();
		
		System.out.println("-------------------------------");
		
		s = new Rectangle();
		s.area();
		
		System.out.println("------------------------------");
		
		s = new Triangle();
		s.area();
	}

}
