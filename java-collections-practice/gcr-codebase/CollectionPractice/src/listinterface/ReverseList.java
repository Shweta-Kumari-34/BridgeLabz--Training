package listinterface;

import java.util.*;

public class ReverseList {

	// method to reverse any List
	public static void reverseList(List<Integer> list) {

		int start = 0;
		int end = list.size() - 1;

		while (start < end) {
			// swap elements
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		// ArrayList example
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		reverseList(arrayList);
		System.out.println("Reversed ArrayList: " + arrayList);

		// LinkedList example
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		reverseList(linkedList);
		System.out.println("Reversed LinkedList: " + linkedList);
	}
}
