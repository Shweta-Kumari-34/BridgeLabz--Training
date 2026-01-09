package com.linearandbinarysearch.find_first_negative_number;

import java.util.Scanner;

public class FirstNegativeNumber {
	public static void main(String[] args) {

		int[] array = { 1, 20, 45, 78, 99, 86, -1, 65, -21, 71 };
		int index = -1;

		// cecking the condition and storing the index
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				index = i;
				break;
			}
		}

		// printing the result
		if (index != -1)
			System.out.println("First negative number is present at index: " + index);
		else
			System.out.println("Negative number is not present");
	}
}
