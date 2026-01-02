package com.encapsulationinterface.ridehailingapplication;


	public class  Auto extends Vehicle {

	    public Auto(int vehicleId, String driverName) {
	        super(vehicleId, driverName, 10.0); // ₹10 per km
	    }

	    @Override
	    double calculateFare(double distance) {
	        return distance * getRatePerKm();
	    }
	}


