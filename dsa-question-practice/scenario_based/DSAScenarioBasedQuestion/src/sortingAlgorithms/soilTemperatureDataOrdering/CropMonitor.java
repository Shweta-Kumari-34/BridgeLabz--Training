package sortingAlgorithms.soilTemperatureDataOrdering;

import java.util.Scanner;

public class CropMonitor {

	public static int partition(int[] timestamps, int low, int high) {

		int pivot = timestamps[high]; 
		int left = low - 1;

		for (int right = low; right < high; right++) {
			if (timestamps[right] <= pivot) {
				left++;

				int temp = timestamps[left];
				timestamps[left] = timestamps[right];
				timestamps[right] = temp;
			}
		}

		int temp = timestamps[left + 1];
		timestamps[left + 1] = timestamps[high];
		timestamps[high] = temp;

		return left + 1;
	}

	public static void quickSort(int[] timestamps, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(timestamps, low, high);

			quickSort(timestamps, low, pivotIndex - 1);
			quickSort(timestamps, pivotIndex + 1, high);
		}
	}

	public static void printTimestamps(int[] timestamps) {
		System.out.println("Sorted Sensor Timestamps:");
		for (int time : timestamps) {
			System.out.print(time + " ");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("=== Welcome to CropMonitor ===");
		System.out.print("Enter number of sensor readings: ");
		int n = input.nextInt();

		int[] timestamps = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter timestamp for sensor reading " + (i + 1) + ": ");
			timestamps[i] = input.nextInt();
		}

		quickSort(timestamps, 0, n - 1);
		printTimestamps(timestamps);
	}
}
