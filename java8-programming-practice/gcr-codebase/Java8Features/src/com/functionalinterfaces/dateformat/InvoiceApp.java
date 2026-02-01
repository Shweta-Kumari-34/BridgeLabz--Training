package com.functionalinterfaces.dateformat;

import java.time.LocalDate;

public class InvoiceApp {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		String format1 = DateUtils.formatDate(today, "dd-MM-yyyy");
		String format2 = DateUtils.formatDate(today, "yyyy/MM/dd");

		System.out.println("Invoice Date (dd-MM-yyyy): " + format1);
		System.out.println("Invoice Date (yyyy/MM/dd): " + format2);
	}
}
