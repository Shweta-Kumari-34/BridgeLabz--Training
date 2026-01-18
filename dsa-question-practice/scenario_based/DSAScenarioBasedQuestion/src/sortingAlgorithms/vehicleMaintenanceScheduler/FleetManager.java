/*FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
*/

package sortingAlgorithms.vehicleMaintenanceScheduler;

import java.util.*;

public class FleetManager {
	// merge the list
	public static void merge(int[] array, int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		int[] temp = new int[high - low + 1];
		int index = 0;
		while (left <= mid && right <= high) {
			if (array[left] <= array[right]) {
				temp[index++] = array[left++];
			} else {
				temp[index++] = array[right++];

			}
		}
		// store the left behind element of 1st part
		while (left <= mid) {
			temp[index++] = array[left++];
		}
        //store the left behind element of 2nd part
		while (right <= high) {
			temp[index++] = array[right++];
		}

		for (int i = 0; i < temp.length; i++) {
			array[low + i] = temp[i];
		}

	}

	// sort the list and merge to get resultant sorted list
	public static void mergeSort(int[] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);
		merge(array, low, mid, high);
	}

	// printing the sorted list
	public static void printList(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("====Welcome To Fleet Manager====");
		System.out.println("Provide the details of vehicle");
		System.out.println("Enter the number of vehicle ");
		int number = input.nextInt();
		int[] mileage = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.println("Enter the mileage of vehicle " + (i + 1));
			mileage[i] = input.nextInt();
		}

		// calling the method
		mergeSort(mileage, 0, number - 1);
		printList(mileage);

	}
}
