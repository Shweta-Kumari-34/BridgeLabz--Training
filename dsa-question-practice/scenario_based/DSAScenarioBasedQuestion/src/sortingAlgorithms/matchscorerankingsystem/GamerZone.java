package sortingAlgorithms.matchscorerankingsystem;

import java.util.Scanner;

public class GamerZone {
	public static int partition(int[] score, int low, int high) {

		int pivot = score[high]; 
		int left = low - 1;

		for (int right = low; right < high; right++) {
			if (score[right] <= pivot) {
				left++;

				int temp = score[left];
				score[left] = score[right];
				score[right] = temp;
			}
		}

		int temp = score[left + 1];
		score[left + 1] = score[high];
		score[high] = temp;

		return left + 1;
	}

	public static void quickSort(int[] score, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(score, low, high);

			quickSort(score, low, pivotIndex - 1);
			quickSort(score, pivotIndex + 1, high);
		}
	}

	public static void printRank(int[] marks) {
		System.out.println("Sorted Rank:");
		for (int i=marks.length-1; i>=0; i--) {
			System.out.print(marks[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("=== Welcome to GamerZone ===");
		System.out.print("Enter number of student: ");
		int n = input.nextInt();

		int[] score = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter score of student " + (i + 1) + ": ");
			score[i] = input.nextInt();
		}

		quickSort(score, 0, n - 1);
		printRank(score);
	}
	
}
