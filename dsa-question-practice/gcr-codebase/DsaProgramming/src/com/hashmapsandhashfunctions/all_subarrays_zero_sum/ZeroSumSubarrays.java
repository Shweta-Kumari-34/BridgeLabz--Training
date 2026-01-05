package com.hashmapsandhashfunctions.all_subarrays_zero_sum;
import java.util.*;
import java.util.*;

public class ZeroSumSubarrays {

    //find all subarrays with zero sum
    public static List<List<Integer>> findZeroSumSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>(); // Map to store cumulative sum and indices
        int cumSum = 0;

        // initialize map with sum 0 at index -1 to handle subarrays starting from index 0
        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            cumSum += arr[i];

            if (sumMap.containsKey(cumSum)) {
                // found zero-sum subarray(s)
                List<Integer> indices = sumMap.get(cumSum);
                
                for (Integer startIndex : indices) {
                    // subarray from startIndex + 1 to i
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = startIndex + 1; j <= i; j++) {
                        subarray.add(arr[j]);
                    }
                    result.add(subarray);
                }
            }

            // add current index to the map
            sumMap.computeIfAbsent(cumSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }
}
