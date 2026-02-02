package com.workshop.smartcity;

public interface GeoUtils {

	// static utility method
	static double calculateDistance(double start, double end) {
		return Math.abs(end - start); // simple distance logic
	}
}
