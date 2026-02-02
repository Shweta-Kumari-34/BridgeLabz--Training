package com.foreachmethod.loggingtransactions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TransactionLogger {

	public static void main(String[] args) {

		// list of transaction IDs
		List<String> transactionIds = Arrays.asList("TXN101", "TXN102", "TXN103");

		// using forEach to log each transaction with current timestamp
		transactionIds.forEach(id -> 
		System.out.println(
				LocalDateTime.now() + " - Transaction: " + id));
	}
}
