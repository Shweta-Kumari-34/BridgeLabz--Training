package com.hashmapsandhashfunctions.longest_consecutive_sequence;

	import java.util.Arrays;

	public class Main {
	    public static void main(String[] args) {
	        int[] arr = {100, 4, 200, 1, 3, 2};

	        System.out.println("Input Array: " + Arrays.toString(arr));

	        int result = LongestConsecutiveSequence.findLongestConsecutive(arr);

	        System.out.println("Length of Longest Consecutive Sequence: " + result);
	    }
	}

