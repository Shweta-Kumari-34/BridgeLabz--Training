package com.encapsulationinterface.vehiclerentalsystem;

abstract class Vehicle {
	
	    private String vehicleNumber;
	    private String type;
	    private double rentalRate;

	    private String insurancePolicyNumber;

	    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber){
	        this.vehicleNumber = vehicleNumber;
	        this.type = type;
	        this.rentalRate = rentalRate;
	        this.insurancePolicyNumber = insurancePolicyNumber;
	    }

	    public String getVehicleNumber(){ return vehicleNumber; }
	    public String getType(){ return type; }
	    public double getRentalRate(){ return rentalRate; }

	    public String getInsurancePolicyNumber(){ return "***" + insurancePolicyNumber.substring(insurancePolicyNumber.length()-3); }

	    public abstract double calculateRentalCost(int days);
	    
	    public void displayDetails(int days){
	        System.out.println("-------------------------------------------------");
	        System.out.println("Vehicle No: " + vehicleNumber);
	        System.out.println("Type: " + type);
	        System.out.println("Rental Rate per Day: " + rentalRate);
	        System.out.println("Rental Cost ("+days+" days): " + calculateRentalCost(days));

	        if(this instanceof Insurable){
	            System.out.println("Insurance Charge: " + ((Insurable)this).calculateInsurance());
	            System.out.println("Insurance Details: " + ((Insurable)this).getInsuranceDetails());
	        }else{
	            System.out.println("Insurance: Not Applicable");
	        }

	        System.out.println("Policy No (Hidden for Security): " + getInsurancePolicyNumber());
	    }
	}


