package com.stacksandqueue.circular_tour_problem;

public class Main {
	public static void main(String[] args) {
		PetrolPump[] pumps = { new PetrolPump(6, 4), new PetrolPump(3, 6), new PetrolPump(7, 3) };

		int start = CircularTour.findStartingPump(pumps);

		if (start != -1) {
			System.out.println("Circular tour can start at pump index: " + start);
		} else {
			System.out.println("Circular tour is not possible with given pumps.");
		}
	}
}
