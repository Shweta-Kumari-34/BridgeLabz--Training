package com.workshop.smartcity;

@FunctionalInterface
public interface FareCalculator {

	// single abstract method
	double calculateFare(double distance);
}
