package listinterface;

import java.util.LinkedList;

public class NthElementFromEnd {

	// method to find Nth element from end
	public static String findNthFromEnd(LinkedList<String> list, int n) {

		int first = 0;
		int second = 0;

		// move first pointer n steps ahead
		for (int i = 0; i < n; i++) {
			if (first == list.size()) {
				return "Invalid N";
			}
			first++;
		}

		// move both pointers until first reaches end
		while (first < list.size()) {
			first++;
			second++;
		}

		return list.get(second);
	}

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		int N = 2;

		String result = findNthFromEnd(list, N);
		System.out.println(result);
	}
}
