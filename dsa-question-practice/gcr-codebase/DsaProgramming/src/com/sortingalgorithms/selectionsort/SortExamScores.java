package com.sortingalgorithms.selectionsort;

import java.util.Scanner;

public class SortExamScores {
	static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			// Finding minimum element in the unsorted part
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// swap the found minimum element with the first unsorted element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = input.nextInt();
		int[] scores = new int[n];
		System.out.println("Enter exam scoresare: ");
		for (int i = 0; i < n; i++) {
			scores[i] = input.nextInt();
		}
		selectionSort(scores);

		System.out.println("\nExam scores in ascending orderare: ");
		for (int score : scores) {
			System.out.print(score + " ");
		}

		input.close();
	}
}
