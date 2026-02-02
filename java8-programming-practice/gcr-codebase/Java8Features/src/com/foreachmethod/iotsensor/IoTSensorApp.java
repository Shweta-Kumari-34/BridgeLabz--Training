package com.foreachmethod.iotsensor;

import java.util.Arrays;
import java.util.List;

public class IoTSensorApp {

	public static void main(String[] args) {

		// list of sensor readings (e.g., temperature values)
		List<Double> readings = Arrays.asList(22.5, 30.1, 18.9, 35.6, 27.0);

		double threshold = 25.0; // threshold value

		// stream to filter readings above threshold and print them
		readings.stream().filter(value -> value > threshold) // keep values above threshold
				.forEach(value -> System.out.println("High reading detected: " + value));
	}
}
