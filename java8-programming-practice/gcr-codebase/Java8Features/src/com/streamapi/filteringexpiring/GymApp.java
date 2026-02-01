package com.streamapi.filteringexpiring;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class GymApp {

	public static void main(String[] args) {

		// list of gym members with expiry dates
		List<Member> members = Arrays.asList(new Member("Aman", LocalDate.now().plusDays(10)), // expires in 10 days
				new Member("Neha", LocalDate.now().plusDays(40)), // expires in 40 days
				new Member("Ravi", LocalDate.now().plusDays(25)), // expires in 25 days
				new Member("Riya", LocalDate.now().plusDays(5)) // expires in 5 days
		);

		// current date
		LocalDate today = LocalDate.now();

		// date after next 30 days
		LocalDate next30Days = today.plusDays(30);

		// stream to filter members whose membership expires within 30 days
		members.stream().filter(m -> !m.expiryDate.isAfter(next30Days)) // expiry <= 30 days
				.forEach(System.out::println); // print result
	}
}
