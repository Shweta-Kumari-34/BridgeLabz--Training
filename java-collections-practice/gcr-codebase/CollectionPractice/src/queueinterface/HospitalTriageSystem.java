package queueinterface;

import java.util.*;

public class HospitalTriageSystem {

	// Patient class
	static class Patient {
		String name;
		int severity;

		Patient(String name, int severity) {
			this.name = name;
			this.severity = severity;
		}
	}

	public static void main(String[] args) {

		// PriorityQueue with custom comparator (higher severity first)
		PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

		// Adding patients
		pq.add(new Patient("Ram", 3));
		pq.add(new Patient("Priya", 5));
		pq.add(new Patient("Annu", 20));

		// Treat patients based on priority
		System.out.print("Treatment order is: ");
		while (!pq.isEmpty()) {
			Patient p = pq.remove();
			System.out.print(p.name + "  ");
		}
	}
}
