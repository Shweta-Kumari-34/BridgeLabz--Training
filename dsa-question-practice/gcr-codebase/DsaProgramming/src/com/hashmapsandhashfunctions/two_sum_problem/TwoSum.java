package com.hashmapsandhashfunctions.two_sum_problem;
import java.util.HashMap;

public class TwoSum {
	
	    //find indices of two numbers that add up to target
	    public static int[] findTwoSum(int[] arr, int target) {
	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < arr.length; i++) {
	            int required = target - arr[i];

	            //check value already exists or not
	            if (map.containsKey(required)) {
	                return new int[] { map.get(required), i };
	            }

	            // store current value with its index
	            map.put(arr[i], i);
	        }

	        // if no pair is found return
	        return new int[] { -1, -1 };
	    }
	}


