package com.linearandbinarysearch.linear_binary_search_challenge;

import java.util.Arrays;

public class FindMissingIntegerAndIndex {

	public static void main(String[] args) {

		int[] array = { 3, 4, -1, 1 };
		int target = 4;

		// finding first missing positive integer
		int n = array.length;
		boolean[] visited = new boolean[n + 1];

		// marking positive integers
		for (int i = 0; i < n; i++) {
			if (array[i] > 0 && array[i] <= n) {
				visited[array[i]] = true;
			}
		}

		int missing = -1;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				missing = i;
				break;
			}
		}

		System.out.println("First missing positive integer: " + missing);

		// finding the target index
		// sorting array first
		Arrays.sort(array);
		int left = 0, right = array.length - 1;
		int index = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				index = mid;
				break;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		System.out.println("Target is " + target + " and its index is: " + index);
	}
}
