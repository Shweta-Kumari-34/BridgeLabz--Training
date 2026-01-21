package mapinterface;

import java.util.*;

public class MergeTwoMaps {

	public static void main(String[] args) {

		// First map
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		// Second map
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("B", 3);
		map2.put("C", 4);

		// Merged map
		Map<String, Integer> merged = new HashMap<>(map1);

		// Merge map2 into merged map
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();

			// if key exists, sum values
			merged.put(key, merged.getOrDefault(key, 0) + value);
		}

		// Output
		System.out.println(merged);
	}
}
