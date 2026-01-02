package com.encapsulationinterface.ridehailingapplication;


	public abstract class Vehicle implements GPS {

	    // Encapsulation: private data members
	    private int vehicleId;
	    private String driverName;
	    private double ratePerKm;
	    protected String location;

	    // Constructor
	    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
	        this.vehicleId = vehicleId;
	        this.driverName = driverName;
	        this.ratePerKm = ratePerKm;
	        this.location = "Not Available";
	    }

	    // Getters (Encapsulation)
	    public int getVehicleId() {
	        return vehicleId;
	    }

	    public String getDriverName() {
	        return driverName;
	    }

	    public double getRatePerKm() {
	        return ratePerKm;
	    }

	    // Abstract method
	    abstract double calculateFare(double distance);

	    // Concrete method
	    public void getVehicleDetails() {
	        System.out.println("Vehicle ID: " + vehicleId);
	        System.out.println("Driver Name: " + driverName);
	        System.out.println("Rate per KM: " + ratePerKm);
	        System.out.println("Current Location: " + location);
	    }

	    // GPS methods
	    public void getCurrentLocation() {
	        System.out.println("Current Location: " + location);
	    }

	    public void updateLocation(String newLocation) {
	        location = newLocation;
	    }
	}

