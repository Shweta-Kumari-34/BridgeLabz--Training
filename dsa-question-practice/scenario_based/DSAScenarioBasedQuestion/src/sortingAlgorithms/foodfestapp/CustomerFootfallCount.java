package sortingAlgorithms.foodfestapp;

import java.util.Scanner;

public class CustomerFootfallCount {
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
		System.out.println("The sorted performance list of stalls is ");
		for (int i =array.length-1;i>=0 ;i--) {
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

		System.out.println("Welcome to Food Fest");
		System.out.println("Enter the number of food stalls");
		int number = input.nextInt();

		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the count of footfall at specific satlls " + (i + 1));
			array[i] = input.nextInt();
		}

		mergeSort(array, 0, number-1);
		printRankList(array);
	}
}
