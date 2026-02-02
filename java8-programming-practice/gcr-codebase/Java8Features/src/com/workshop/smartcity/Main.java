package com.workshop.smartcity;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// ---------------- Transport Services ----------------
		List<TransportService> services = Arrays.asList(new BusService(), new MetroService(), new TaxiService(),
				new AmbulanceService());

		// forEach + method reference
		services.forEach(TransportService::printServiceDetails);

		// marker interface check
		services.forEach(service -> {
			if (service instanceof EmergencyService) {
				System.out.println(service.getServiceName() + " has priority access");
			}
		});

		// ---------------- Lambda (Fare Calculation) ----------------
		FareCalculator fareCalculator = distance -> distance * 10;

		double distance = GeoUtils.calculateDistance(10, 25);
		System.out.println("Fare: " + fareCalculator.calculateFare(distance));

		// ---------------- Passenger Data ----------------
		List<Passenger> passengers = Arrays.asList(new Passenger("Route-A", 50, true),
				new Passenger("Route-A", 40, false), new Passenger("Route-B", 60, true),
				new Passenger("Route-B", 30, false));

		// ---------------- groupingBy ----------------
		Map<String, List<Passenger>> passengersByRoute = passengers.stream()
				.collect(Collectors.groupingBy(Passenger::getRoute));

		System.out.println("\nPassengers grouped by route:");
		passengersByRoute.forEach((route, list) -> System.out.println(route + " -> " + list.size()));

		// ---------------- partitioningBy ----------------
		Map<Boolean, List<Passenger>> peakPartition = passengers.stream()
				.collect(Collectors.partitioningBy(Passenger::isPeakTime));

		System.out.println("\nPeak time passengers: " + peakPartition.get(true).size());
		System.out.println("Non-peak passengers: " + peakPartition.get(false).size());

		// ---------------- summarizingDouble ----------------
		DoubleSummaryStatistics fareStats = passengers.stream()
				.collect(Collectors.summarizingDouble(Passenger::getFare));

		System.out.println("\nTotal Fare: " + fareStats.getSum());
		System.out.println("Average Fare: " + fareStats.getAverage());
		System.out.println("Max Fare: " + fareStats.getMax());
	}
}
