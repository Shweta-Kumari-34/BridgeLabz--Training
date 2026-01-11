package com.runtimeAnalysisAlgorithms.sorting_large_data_eficiently;

import java.util.Random;

public class CompareSortingAlgorithms {

//bubble sort
	static void bubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

//merge sort
	static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

//quick sort
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);

			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		int size = 10000;
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		int[] arr3 = new int[size];

		Random r = new Random();

		for (int i = 0; i < size; i++) {
			int value = r.nextInt(10000);
			arr1[i] = value;
			arr2[i] = value;
			arr3[i] = value;
		}

		long start, end;

		start = System.currentTimeMillis();
		bubbleSort(arr1);
		end = System.currentTimeMillis();
		System.out.println("Time taken by Bubble sort is : " + (end - start) + " ms");

		start = System.currentTimeMillis();
		mergeSort(arr2, 0, size - 1);
		end = System.currentTimeMillis();
		System.out.println("Time taken by Merge Sort is: " + (end - start) + " ms");

		start = System.currentTimeMillis();
		quickSort(arr3, 0, size - 1);
		end = System.currentTimeMillis();
		System.out.println("Tme taken by Quick Sort is: " + (end - start) + " ms");
	}
}
