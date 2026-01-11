package com.runtimeAnalysisAlgorithms.large_file_reading_efficiency;

import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileReadingComaparison {

	public static void main(String[] args) throws IOException {

		String filePath = "D:\\java file\\QuizApplication.java"; // path of large file"
		long start, end;

		// using FileReader
		FileReader fReader = new FileReader(filePath);
		start = System.currentTimeMillis();

		while (fReader.read() != -1) {
			// reading character by character
		}

		end = System.currentTimeMillis();
		fReader.close();
		System.out.println("Time Taken by FileReader is: " + (end - start) + " ms");

		// using InputStreamReader
		InputStreamReader inputReader = new InputStreamReader(new FileInputStream(filePath));

		start = System.currentTimeMillis();

		while (inputReader.read() != -1) {

			// reading byte and converting to character
		}

		end = System.currentTimeMillis();
		inputReader.close();
		System.out.println("Time taken by InputStreamReader is: " + (end - start) + " ms");
	}
}
