package streams.countwordsoffile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TopFiveWordCount {

	public static void main(String[] args) {

		String fileName = "D:\\java file\\Account.txt";
		HashMap<String, Integer> wordCount = new HashMap<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				String[] words = line.toLowerCase().split("\\s+");

				for (String word : words) {
					if (word.length() > 0) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
					}
				}
			}
			br.close();

			// Convert map to list for sorting
			List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

			// Sort by frequency (descending)
			list.sort((a, b) -> b.getValue() - a.getValue());

			// Print top 5 words
			System.out.println("Top 5 frequent words are:");
			for (int i = 0; i < 5 && i < list.size(); i++) {
				System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
			}

		} catch (IOException e) {
			System.out.println("Error while reading file occur");
		}
	}
}
