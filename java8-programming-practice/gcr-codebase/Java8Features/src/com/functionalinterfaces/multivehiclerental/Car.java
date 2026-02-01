package com.functionalinterfaces.multivehiclerental;

//Car implements Vehicle interface
public class Car implements Vehicle {

	@Override
	public void rent() {
		System.out.println("Car has been rented");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Car has been returned");
	}
}
