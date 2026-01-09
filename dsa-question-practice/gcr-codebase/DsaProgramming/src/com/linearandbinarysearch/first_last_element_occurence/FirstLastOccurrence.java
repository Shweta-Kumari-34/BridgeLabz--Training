package com.linearandbinarysearch.first_last_element_occurence;

public class FirstLastOccurrence {

	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 2, 3, 4, 5 };
		int target = 2;

		int first = -1;
		int last = -1;

		// finding first occurrence
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				first = mid;
				right = mid - 1;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		// finding last occurrence
		left = 0;
		right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				last = mid;
				left = mid + 1;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		System.out.println("Element first occurrence is: " + first);
		System.out.println("Element last occurrence is: " + last);
	}
}
