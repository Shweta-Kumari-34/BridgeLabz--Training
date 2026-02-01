package com.functionalinterfaces.smartvehicle;

public class DashboardApp {

	public static void main(String[] args) {

		Vehicle car = new Car();
		Vehicle electricCar = new ElectricCar();

		car.displaySpeed();
		car.displayBattery(); // default method

		electricCar.displaySpeed();
		electricCar.displayBattery(); // overridden method
	}
}
