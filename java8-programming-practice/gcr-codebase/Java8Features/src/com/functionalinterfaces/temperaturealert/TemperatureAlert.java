package com.functionalinterfaces.temperaturealert;

import java.util.function.Predicate;

public class TemperatureAlert {

	public static void main(String[] args) {

		// threshold temperature
		double threshold = 40.0;

		// Predicate to check if temperature crosses threshold
		Predicate<Double> isHighTemperature = temp -> temp > threshold;

		double[] readings = { 35.5, 38.0, 41.2, 39.8, 45.0 };

		for (double temp : readings) {

			if (isHighTemperature.test(temp)) {
				System.out.println("ALERT! High temperature: " + temp);
			} else {
				System.out.println("Temperature normal: " + temp);
			}
		}
	}
}
