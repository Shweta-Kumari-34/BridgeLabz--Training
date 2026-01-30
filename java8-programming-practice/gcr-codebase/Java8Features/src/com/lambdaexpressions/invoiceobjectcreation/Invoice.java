package com.lambdaexpressions.invoiceobjectcreation;

public class Invoice {

	private String transactionId;

	// constructor
	public Invoice(String transactionId) {
		this.transactionId = transactionId;
	}

	// getter
	public String getTransactionId() {
		return transactionId;
	}

	@Override
	public String toString() {
		return "Invoice{transactionId='" + transactionId + "'}";
	}
}
