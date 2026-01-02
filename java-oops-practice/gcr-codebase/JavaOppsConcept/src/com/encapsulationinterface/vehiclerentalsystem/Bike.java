package com.encapsulationinterface.vehiclerentalsystem;

	public class Bike extends Vehicle {

	    public Bike(String number, double rate, String policy){
	        super(number, "Bike", rate, policy);
	    }

	    public double calculateRentalCost(int days){
	        return getRentalRate() * days * 0.9; // 10% discount for bikes
	    }
	}


