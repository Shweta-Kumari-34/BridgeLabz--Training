package listinterface;

import java.util.*;

public class RotateElements {

	// Method to rotate list to the left by k positions
	public static void rotateList(List<Integer> list, int k) {

		int n = list.size();
		k = k % n; // handle rotations greater than list size

		// temporary list to store rotated result
		List<Integer> temp = new ArrayList<>();

		// add elements from k to end
		for (int i = k; i < n; i++) {
			temp.add(list.get(i));
		}

		// add elements from start to k
		for (int i = 0; i < k; i++) {
			temp.add(list.get(i));
		}

		// copy back to original list
		for (int i = 0; i < n; i++) {
			list.set(i, temp.get(i));
		}
	}

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		int rotateBy = 2;

		rotateList(numbers, rotateBy);

		System.out.println(numbers);
	}
}