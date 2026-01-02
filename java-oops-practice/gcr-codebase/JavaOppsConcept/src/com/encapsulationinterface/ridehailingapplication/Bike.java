package com.encapsulationinterface.ridehailingapplication;


	class Bike extends Vehicle {

	    public Bike(int vehicleId, String driverName) {
	        super(vehicleId, driverName, 8.0); // ₹8 per km
	    }

	    @Override
	    double calculateFare(double distance) {
	        return distance * getRatePerKm();
	    }
	}


