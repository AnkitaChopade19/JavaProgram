package com.ai;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car is Start");		
	}

	@Override
	public void stop() {
		System.out.println("Car is stop");
		
	}

}
