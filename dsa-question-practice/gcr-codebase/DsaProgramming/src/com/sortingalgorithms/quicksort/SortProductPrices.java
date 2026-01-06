package com.sortingalgorithms.quicksort;
import java.util.Scanner;

public class SortProductPrices {
	    static void quickSort(double[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            // recursively sort left and right subarrays
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    static int partition(double[] arr, int low, int high) {
	        double pivot = arr[high]; // choosing last element as pivot
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                // swap arr[i] and arr[j]
	                double temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // swap pivot to its correct position
	        double temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	        return i + 1;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of products: ");
	        int n = input.nextInt();
	        double[] prices = new double[n];

	        System.out.println("Enter product prices are: ");
	        for (int i = 0; i < n; i++) {
	            prices[i] = input.nextDouble();
	        }
	        quickSort(prices, 0, n - 1);

	        System.out.println("\nProduct prices in ascending orderare: ");
	        for (double price : prices) {
	            System.out.print(price + " ");
	        }

	        input.close();
	    }
	}


