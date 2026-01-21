package mapinterface;

import java.util.*;

public class InvertMap {

	public static void main(String[] args) {

		// Original map
		Map<String, Integer> original = new HashMap<>();
		original.put("A", 1);
		original.put("B", 2);
		original.put("C", 1);

		// Inverted map value -> list of keys
		Map<Integer, List<String>> inverted = new HashMap<>();

		for (Map.Entry<String, Integer> entry : original.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			// If value already exists, add key to its list
			if (!inverted.containsKey(value)) {
				inverted.put(value, new ArrayList<>());
			}
			inverted.get(value).add(key);
		}

		// Output
		System.out.println(inverted); 
	}
}
