package com.encapsulationinterface.vehiclerentalsystem;

	public class Truck extends Vehicle implements Insurable {

	    public Truck(String number, double rate, String policy){
	        super(number, "Truck", rate, policy);
	    }
	    public double calculateRentalCost(int days){
	        return getRentalRate() * days + 1000; // Additional heavy-duty charge
	    }

	    public double calculateInsurance(){
	        return getRentalRate() * 0.25; // 25% insurance
	    }

	    public String getInsuranceDetails(){
	        return "Truck Heavy Load Insurance (25% of rental rate)";
	    }
	}

