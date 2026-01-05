package com.hashmapsandhashfunctions.pair_sum_in_array;
import java.util.HashMap;
import java.util.Arrays;

public class PairSum {

	    // Method to check if a pair with given sum exists
	    public static boolean hasPairWithSum(int[] arr, int targetSum) {
	        HashMap<Integer, Boolean> map = new HashMap<>();

	        for (int num : arr) {
	            int required = targetSum - num;

	            // Check if required number already exists
	            if (map.containsKey(required)) {
	                System.out.println("Pair found: (" + required + ", " + num + ")");
	                return true;
	            }

	            // Store current number as visited
	            map.put(num, true);
	        }

	        // No pair found
	        return false;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {8, 7, 2, 5, 3, 1};
	        int targetSum = 10;

	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.println("Target Sum: " + targetSum);

	        boolean result = PairSum.hasPairWithSum(arr, targetSum);

	        if (result) {
	            System.out.println("A pair with the given sum exists.");
	        } else {
	            System.out.println("No pair with the given sum exists.");
	        }
	    }
	}


