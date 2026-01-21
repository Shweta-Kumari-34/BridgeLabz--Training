package queueinterface;

import java.util.*;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {

		int N = 5;

		Queue<String> queue = new LinkedList<>();
		List<String> result = new ArrayList<>();

		// Start with "1"
		queue.add("1");

		for (int i = 0; i < N; i++) {

			// Remove front element
			String current = queue.remove();
			result.add(current);

			// Generate next binary numbers
			queue.add(current + "0");
			queue.add(current + "1");
		}

		// Output
		System.out.println(result);
	}
}
