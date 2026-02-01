package com.streamapi.filteringexpiring;

import java.time.LocalDate;

public class Member {

	String name; // member name
	LocalDate expiryDate; // membership expiry date

	// constructor to initialize member data
	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	// used while printing member details
	@Override
	public String toString() {
		return name + " → expires on " + expiryDate;
	}
}
