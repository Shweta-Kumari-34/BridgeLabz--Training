package com.linearandbinarysearch.count_occurrence_of_word_in_file_reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOccurrenceOfAWord {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the file path ");
	        String filePath = input.nextLine();
	        System.out.print("Enter the word to count: ");
	        String targetWord = input.nextLine();
	        int count = 0;

	        try {
	            FileReader reader = new FileReader(filePath);
	            BufferedReader fileReader = new BufferedReader(reader);

	            String line;

	            while ((line = fileReader.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                for (String word : words) {
	                    if (word.equals(targetWord)) {
	                        count++;
	                    }
	                }
	            }

	            fileReader.close();
	            reader.close();

	            System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");

	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }

	        input.close();
	    }
	}


