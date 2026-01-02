package com.encapsulationinterface.ridehailingapplication;


	public class Car extends Vehicle {

	    public Car(int vehicleId, String driverName) {
	        super(vehicleId, driverName, 15.0); // ₹15 per km
	    }

	    @Override
	    double calculateFare(double distance) {
	        return distance * getRatePerKm();
	    }
	}


