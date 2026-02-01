package com.functionalinterfaces.smartvehicle;

public interface Vehicle {

	// common method for all vehicles
	void displaySpeed();

	// new feature for electric vehicles
	default void displayBattery() {
		// default behavior for non-electric vehicles
		System.out.println("Battery information not available");
	}
}
