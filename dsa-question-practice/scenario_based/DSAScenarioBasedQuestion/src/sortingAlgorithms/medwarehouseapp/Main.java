/*
 *  MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory
 */

package sortingAlgorithms.medwarehouseapp;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("********Welcome To MedWarehouse*********");

		Medicine[] list= {
				//Date in (YYYY-MM-DD) format
				new Medicine("2024-08-22", "Paracetamol"  ) ,
				new Medicine("2025-09-23", "Ibuprofen" ),
				new Medicine("2026-10-24", "Amoxicillin" ),
				new Medicine("2020-03-25", "Cetirizine"),
				new Medicine( "2005-11-29", "Aspirin"),
				new Medicine( "2000-12-11", "Pantoprazole" ),
				new Medicine( "2000-12-10", "Omeprazole" ),
				new Medicine( "2011-10-12", "Metformin"),
		};
		
		MergeSort.printRankList( list, "Medicine List Before Sorting ");
		MergeSort.mergeSort( list, 0, list.length-1);
		
	    MergeSort.printRankList( list, "Medicine List After Sorting ");
		System.out.println("********Thank You !!!*********");
		System.out.println("********Visit Again*********");
}
}