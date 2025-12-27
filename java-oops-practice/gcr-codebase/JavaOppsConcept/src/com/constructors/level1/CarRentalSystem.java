package com.constructors.level1;

public class CarRentalSystem {
	String customerName;
	String carModel;
	int rentalDays;
	CarRentalSystem ( String customerName, String carModel, int rentalDays){
	    	this.customerName = customerName;
	    	this.carModel = carModel;
	    	this. rentalDays= rentalDays;
	}
	double calculateTotalCost(int rentalDays ) {
		//cost per day is 500;
		double cost = 500*rentalDays;
		return cost;
	}
	void displayDetails() {
		System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost(6));
	}
	public static void main(String[] args) {
		CarRentalSystem rent1 = new CarRentalSystem (  "Priya", "honda City", 5);
		rent1.displayDetails();
	}
}
