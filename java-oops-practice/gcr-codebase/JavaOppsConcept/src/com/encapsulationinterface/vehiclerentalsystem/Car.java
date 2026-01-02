package com.encapsulationinterface.vehiclerentalsystem;

	 public class Car extends Vehicle implements Insurable {

	    public Car(String number, double rate, String policy){
	        super(number, "Car", rate, policy);
	    }

	    public double calculateRentalCost(int days){
	        return getRentalRate() * days;  // Normal cost
	    }

	    public double calculateInsurance(){
	        return getRentalRate() * 0.15;  // 15% insurance
	    }

	    public String getInsuranceDetails(){
	        return "Car Insurance (15% of rental rate)";
	    }
	}


