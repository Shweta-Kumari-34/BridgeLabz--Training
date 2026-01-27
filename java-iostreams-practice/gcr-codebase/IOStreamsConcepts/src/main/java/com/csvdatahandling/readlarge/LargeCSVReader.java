package com.csvdatahandling.readlarge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

	private static final int CHUNK_SIZE = 100;

	public static void main(String[] args) {

		String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\StudentIO.csv";

		int totalRecords = 0;
		List<String> buffer = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			// skip header
			br.readLine();

			while ((line = br.readLine()) != null) {

				buffer.add(line);

				if (buffer.size() == CHUNK_SIZE) {
					processChunk(buffer);
					totalRecords += buffer.size();
					buffer.clear(); // free memory
					System.out.println("Processed records: " + totalRecords);
				}
			}

			// process remaining lines (<100)
			if (!buffer.isEmpty()) {
				processChunk(buffer);
				totalRecords += buffer.size();
				System.out.println("Processed records: " + totalRecords);
			}

			System.out.println("Total records processed: " + totalRecords);

		} catch (IOException e) {
			System.out.println("Error reading large CSV file");
		}
	}

	// dummy processing method
	private static void processChunk(List<String> records) {
		for (String record : records) {
			// example processing
			// System.out.println(record);
		}
	}
}
