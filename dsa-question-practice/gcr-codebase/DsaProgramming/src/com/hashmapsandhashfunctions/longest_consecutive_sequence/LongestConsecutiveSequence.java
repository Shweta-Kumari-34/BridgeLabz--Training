package com.hashmapsandhashfunctions.longest_consecutive_sequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	//find length of longest consecutive sequence
	public static int findLongestConsecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

		// store all elements in the hash set
		for (int num : arr) {
			set.add(num);
		}

		int longestLength = 0;

		// check for consecutive sequences
		for (int num : arr) {
			//count if num is the beginning of a sequence
			if (!set.contains(num - 1)) {
				int currentNum = num;
				int currentLength = 1;

				// count consecutive numbers
				while (set.contains(currentNum + 1)) {
					currentNum++;
					currentLength++;
				}

				//update longest length
				longestLength = Math.max(longestLength, currentLength);
			}
		}

		return longestLength;
	}
}
