package sortingAlgorithms.ticketPriceOptimizer;
import java.util.Scanner;

public class EventManager {

	public static int partition(int[] prices, int low, int high) {

		int pivot = prices[high];
		int left = low - 1;

		for (int right = low; right < high; right++) {
			if (prices[right]
			            <= pivot) {
				left++;

				int temp = prices[left];
				prices[left] = prices[right];
				prices[right] = temp;
			}
		}

		int temp = prices[left + 1];
		prices[left + 1] = prices[high];
		prices[high] = temp;

		return left + 1;
	}

	public static void quickSort(int[] prices, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(prices, low, high);

			quickSort(prices, low, pivotIndex - 1);
			quickSort(prices, pivotIndex + 1, high);
		}
	}

	public static void printPrices(int[] prices) {
		System.out.println("Sorted Ticket Prices:");
		for (int price : prices) {
			System.out.print(price + " ");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("===Welcome to EventManager===");
		System.out.print("----Enter number of tickets:---- ");
		int n = input.nextInt();

		int[] prices = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter ticket price " + (i + 1) + ": ");
			prices[i] = input.nextInt();
		}

		quickSort(prices, 0, n - 1);
		printPrices(prices);
	}
}
