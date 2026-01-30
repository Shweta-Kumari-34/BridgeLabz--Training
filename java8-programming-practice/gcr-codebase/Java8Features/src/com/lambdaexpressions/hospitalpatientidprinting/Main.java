package com.lambdaexpressions.hospitalpatientidprinting;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Patient> patients = Arrays.asList(new Patient(101, "Aman"), new Patient(102, "Neha"),
				new Patient(103, "Ravi"), new Patient(104, "Riya"));

		// using method reference instead of lambda
		patients.stream().map(Patient::getId).forEach(System.out::println);
	}
}
