package mapinterface;

import java.util.*;

public class FindHighestValueKey {

	public static void main(String[] args) {

		// Input map
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);

		// Variables to track max
		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		// Traverse the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}

		// Output
		System.out.println(maxKey); 
	}
}
