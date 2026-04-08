package com.ai;

public class mainHome {
	public static void main(String[] args) {

        SmartDevice fan = new Fan();
        SmartDevice light = new Light();
        SmartDevice ac = new AC();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}

