package com.lambdaexpressions.invoiceobjectcreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

		// constructor reference used here
		List<Invoice> invoices = transactionIds.stream().map(Invoice::new) // constructor reference
				.collect(Collectors.toList());

		invoices.forEach(System.out::println);
	}
}
