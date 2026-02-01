package com.functionalinterfaces.dataexport;

public interface DataExporter {

	// existing export methods
	void exportToCSV();

	void exportToPDF();

	// new feature added later
	default void exportToJSON() {
		System.out.println("Exporting data to JSON format");
	}
}
