package mapinterface;

import java.util.*;
import java.io.*;

public class WordFrequency {

	public static void main(String[] args) {

		// File path (change to your file)
		String fileName = "D:\\java file\\MaxOfThree.java";

		// Map to store word frequencies
		Map<String, Integer> wordCount = new HashMap<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;

			while ((line = br.readLine()) != null) {

				// Remove punctuation and convert to lowercase
				line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

				// Split line into words
				String[] words = line.split("\\s+");

				for (String word : words) {
					if (word.isEmpty())
						continue;

					// Update frequency
					wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
				}
			}

			br.close();

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		// Output
		System.out.println(wordCount);
	}
}
