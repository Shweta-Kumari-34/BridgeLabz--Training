package com.linearandbinarysearch.input_stream_reader2;

import java.io.*;

public class ReadUserInputAndWriteToFile {

	public static void main(String[] args) {
		String filePath = "D:\\java file\\LargestSecondLargest.java"; // file to write input

		try {
			// Create InputStreamReader from console
			InputStreamReader userInput = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(userInput);

			// creating FileWriter to write in file
			FileWriter write = new FileWriter(filePath, true);
			BufferedWriter writer = new BufferedWriter(write);

			System.out.println("Enter text (type 'exit' to stop):");

			String line;
			while (true) {
				// Read input
				line = reader.readLine();

				// Check for exit condition
				if (line.equalsIgnoreCase("exit")) {
					break;
				}

				// write input to file
				writer.write(line);
				writer.newLine(); // write each input on a new line
			}

			writer.close();
			write.close();
			reader.close();
			userInput.close();

			System.out.println("User input successfully written to " + filePath);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
