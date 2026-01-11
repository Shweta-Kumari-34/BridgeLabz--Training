package com.runtimeAnalysisAlgorithms.search_target_in_dataset;

import java.util.Arrays;

public class PerformanceComparison {
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int target) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target)
				return mid;
			else if (arr[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int N = 1000000;
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = i + 1;
		}

		int target = N - 1;

		long startLinear = System.nanoTime();
		linearSearch(array, target);
		long endLinear = System.nanoTime();
		System.out.println("Time taken in Linear Search is: " + (endLinear - startLinear) / 1000000.0 + " ms");

		Arrays.sort(array);
		long startBinary = System.nanoTime();
		binarySearch(array, target);
		long endBinary = System.nanoTime();
		System.out.println("Time taken in Binary Search is: " + (endBinary - startBinary) / 1000000.0 + " ms");
	}
}
