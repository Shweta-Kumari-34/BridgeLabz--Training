package com.jsondata.carobject;

public class Car {

	// car brand
	private String brand;

	// car model
	private String model;

	// manufacturing year
	private int year;

	// constructor to initialize values
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// getter for brand
	public String getBrand() {
		return brand;
	}

	// getter for model
	public String getModel() {
		return model;
	}

	// getter for year
	public int getYear() {
		return year;
	}
}
