package com.collectors.wordfrequencycounter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {

		// input paragraph
		String paragraph = "java is easy and java is powerful";

		// convert paragraph into words and count frequency
		Map<String, Integer> wordCount = Arrays.stream(paragraph.split("\\s+")) // split by space
				.collect(Collectors.toMap(word -> word, // key = word
						word -> 1, // initial count
						Integer::sum // if duplicate, add counts
				));

		// print word frequency
		wordCount.forEach((word, count) -> 
		System.out.println(word + " -> " + count)
		);
	}
}
