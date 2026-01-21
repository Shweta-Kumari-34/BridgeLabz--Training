package sortingAlgorithms.tailorshopapp;

import java.util.Scanner;

public class SortDeliveryDeadline {
	public static void insertionSort(String [] array, int number)	{
		for( int i=1;i<number;i++) {
			String curr = array[i];
			int prev= i-1;
			while( prev>=0 && array[prev].compareToIgnoreCase(curr)>0) {
			array[prev+1]= array[prev];
			prev--;
			}
			array[prev+1]=curr;
		}
	}

	public static void printList(String [] array) {
	System.out.println("Sorted deadline:");
		for( int i=0;i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
		
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("=====Welcome To TailorShop App=====");
		System.out.println("Provide the deadline details");
		System.out.println("Enter the number of deadline");
		int number = input.nextInt();
		String [] deadline= new String [number];
		for( int i=0; i<number;i++) {
			System.out.println("Enter the delivery deadline date (YYYY-MM-DD "+ (i+1));
			deadline[i]= input.next();
		}
		
		insertionSort(deadline , number);
		printList(deadline);
	}
}
