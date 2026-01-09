package com.linearandbinarysearch.find_rotation_point;

public class ArraySmallestElement {

	public static int findRotationPoint(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] > arr[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left; // index of smallest element
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

		int index = findRotationPoint(arr);

		System.out.println("Rotation point index is : " + index);
		System.out.println("Smallest element is : " + arr[index]);
	}
}
