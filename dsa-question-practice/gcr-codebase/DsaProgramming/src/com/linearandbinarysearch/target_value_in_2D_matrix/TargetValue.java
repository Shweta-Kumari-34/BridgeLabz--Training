package com.linearandbinarysearch.target_value_in_2D_matrix;

public class TargetValue {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 36, 5, 79 }, { 10, 19, 54, 88 }, { 85, 30, 19, 6 } };

		int target = 88;
		boolean found = false;

		for (int i = 0; i < matrix.length; i++) {

			int left = 0;
			int right = matrix[i].length - 1;

			// checking if target can be in this row
			if (target >= matrix[i][0] && target <= matrix[i][right]) {

				while (left <= right) {
					int mid = left + (right - left) / 2;

					if (matrix[i][mid] == target) {
						found = true;
						break;
					} else if (matrix[i][mid] < target) {
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				}
				break;
			}
		}

		System.out.println("Status is: " + found);
	}
}
