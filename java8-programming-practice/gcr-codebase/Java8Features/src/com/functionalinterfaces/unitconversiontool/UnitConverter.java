package com.functionalinterfaces.unitconversiontool;

//interface with static utility methods
public interface UnitConverter {

	// convert kilometers to miles
	static double kmToMiles(double km) {
		return km * 0.621371;
	}

	// convert kilograms to pounds
	static double kgToPounds(double kg) {
		return kg * 2.20462;
	}
}
