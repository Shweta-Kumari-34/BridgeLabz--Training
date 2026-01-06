package com.sortingalgorithms.heapsort;

import java.util.Scanner;

public class SortJobApplicantsSalary {

	static void heapSort(int[] arr) {
		int n = arr.length;

	// calculating Max Heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

	// extract elements from heap one by one
		for (int i = n - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

	   // call heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// heapify method (Max Heap)
	static void heapify(int[] arr, int n, int i) {
		int largest = i; // root
		int left = 2 * i + 1; // left child
		int right = 2 * i + 2; // right child

		// if left child is larger
		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}

		// if right child is larger
		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}

		// if largest is not root
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

		// recursively heapify the affected subtree
			heapify(arr, n, largest);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Please enter number of applicants: ");
		int n = input.nextInt();

		int[] salaries = new int[n];

		System.out.println("Please enter expected salary demands:");
		for (int i = 0; i < n; i++) {
			salaries[i] = input.nextInt();
		}

		heapSort(salaries);

		System.out.println("\nSalary demands in ascending order are: ");
		for (int salary : salaries) {
			System.out.print(salary + " ");
		}

		input.close();
	}
}
