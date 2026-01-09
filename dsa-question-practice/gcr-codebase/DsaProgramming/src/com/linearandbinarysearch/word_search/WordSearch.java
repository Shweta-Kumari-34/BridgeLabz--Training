package com.linearandbinarysearch.word_search;

public class WordSearch {

	public static String searchSentence(String[] sentences, String word) {

		for (String sentence : sentences) {
			// if word contain return the specific string
			if (sentence.contains(word)) {
				return sentence;
			}
		}
		return "Not Found";
	}

	public static void main(String[] args) {

		String[] sentences = { "Java is a powerful programming language", "There are Seven days in a week",
				"Water present in liquid state", "Sun rises in the East" };

		String word = "days";

		String ans = searchSentence(sentences, word);
		System.out.println(ans);
	}
}
