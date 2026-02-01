package com.functionalinterfaces.multivehiclerental;

//Bus implements Vehicle interface
public class Bus implements Vehicle {

	@Override
	public void rent() {
		System.out.println("Bus has been rented");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Bus has been returned");
	}
}
