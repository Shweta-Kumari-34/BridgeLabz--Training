package com.sortingalgorithms.bubblesort;

import java.util.*;

public class SortStudentMarks {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = input.nextInt();

		int[] marks = new int[n];

		System.out.println("Enter student marks:");
		for (int i = 0; i < n; i++) {
			marks[i] = input.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
				if (marks[j] > marks[j + 1]) {
					int temp = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}

		System.out.println("Sorted Student Marks in (Ascending Order) Are:");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}

		input.close();
	}
}
