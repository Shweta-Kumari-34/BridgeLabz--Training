package com.hashmapsandhashfunctions.all_subarrays_zero_sum;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4, -2, -2 };

		System.out.println("Input Array: " + Arrays.toString(arr));

		// Find all zero-sum subarrays
		List<List<Integer>> zeroSumSubarrays = ZeroSumSubarrays.findZeroSumSubarrays(arr);

		System.out.println("Zero-Sum Subarrays:");
		for (List<Integer> subarray : zeroSumSubarrays) {
			System.out.println(subarray);
		}
	}
}
