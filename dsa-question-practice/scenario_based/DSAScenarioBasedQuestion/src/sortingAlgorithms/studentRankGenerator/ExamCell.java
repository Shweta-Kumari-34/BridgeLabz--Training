package sortingAlgorithms.studentRankGenerator;

import java.util.*;

public class ExamCell {
	public static void merge(int[] array, int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		int count = 0;
		int[] temp = new int[high-low +1];
		while (left <= mid && right <= high) {
			if (array[left] <= array[right]) {
				temp[count++] = array[left++];
				
			} else {
				temp[count++] = array[right++];
			
			}

		}
		while (left <= mid) {
			temp[count++] = array[left++];
		
		}
		while (right <= high) {
			temp[count++] = array[right++];
			
		}

		for (int i = 0; i < temp.length; i++) {
			array[low+i] = temp[i];
		}

	}

	public static void printRankList(int[] array) {
		System.out.println("The sorted rank list is ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void mergeSort(int[] array, int low, int high) {
		if (low >= high) {
		    return;
		}
		int mid = (low + high) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);
		merge(array, low, mid, high);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to ExamCell");
		System.out.println("Enter the number of student");
		int number = input.nextInt();

		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the score of student of student " + (i + 1));
			array[i] = input.nextInt();
		}

		mergeSort(array, 0, number-1);
		printRankList(array);
	}
}
