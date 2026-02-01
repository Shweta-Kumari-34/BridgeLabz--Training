package com.functionalinterfaces.multivehiclerental;

//Bike implements Vehicle interface
public class Bike implements Vehicle {

	@Override
	public void rent() {
		System.out.println("Bike has been rented");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Bike has been returned");
	}
}
