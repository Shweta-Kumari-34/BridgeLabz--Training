package com.hashmapsandhashfunctions.two_sum_problem;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Target Sum: " + target);

		int[] result = TwoSum.findTwoSum(arr, target);

		if (result[0] != -1) {
			System.out.println("Indices found: " + result[0] + " and " + result[1]);
			System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]]);
		} else {
			System.out.println("No two indices found that add up to the target.");
		}
	}
}
