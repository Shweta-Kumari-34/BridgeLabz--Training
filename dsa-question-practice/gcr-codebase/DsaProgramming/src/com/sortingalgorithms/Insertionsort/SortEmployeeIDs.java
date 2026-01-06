package com.sortingalgorithms.Insertionsort;
import java.util.Scanner;

public class SortEmployeeIDs {

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of employees: ");
	        int n = input.nextInt();

	        int[] empIds = new int[n];

	        System.out.println("Enter employee IDs:");
	        for (int i = 0; i < n; i++) {
	            empIds[i] = input.nextInt();
	        }

	        // Insertion Sort Logic
	        for (int i = 1; i < n; i++) {
	            int key = empIds[i];
	            int j = i - 1;

	            // shifting elements when greater than key
	            while (j >= 0 && empIds[j] > key) {
	                empIds[j + 1] = empIds[j];
	                j--;
	            }

	            empIds[j + 1] = key;
	        }

	        System.out.println("Sorted Employee IDs (Ascending Order):");
	        for (int id : empIds) {
	            System.out.print(id + " ");
	        }

	        input.close();
	    }
	}


