package com.functionalinterfaces.smartvehicle;

public class ElectricCar implements Vehicle {

	@Override
	public void displaySpeed() {
		System.out.println("Electric car speed: 60 km/h");
	}

	// overriding default method
	@Override
	public void displayBattery() {
		System.out.println("Battery level: 75%");
	}
}
