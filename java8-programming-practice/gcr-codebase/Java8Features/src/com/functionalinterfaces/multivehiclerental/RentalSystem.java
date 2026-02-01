package com.functionalinterfaces.multivehiclerental;

public class RentalSystem {

	public static void main(String[] args) {

		Vehicle car = new Car();
		Vehicle bike = new Bike();
		Vehicle bus = new Bus();

		car.rent();
		bike.rent();
		bus.rent();

		car.returnVehicle();
		bike.returnVehicle();
		bus.returnVehicle();
	}
}
