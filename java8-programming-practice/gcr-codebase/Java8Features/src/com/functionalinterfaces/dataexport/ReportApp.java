package com.functionalinterfaces.dataexport;

public class ReportApp {

	public static void main(String[] args) {

		DataExporter exporter = new SalesReportExporter();

		exporter.exportToCSV();
		exporter.exportToPDF();
		exporter.exportToJSON(); // default method
	}
}
