package com.ai;

public class mainVehicle {
	public static void main(String args[]) {
		
		Vehicle v = new Car();
		v.start();
		v.stop();
		
		System.out.println("-----------------------");
		
		v = new Bike();
		v.start();
		v.stop();
	}

}
