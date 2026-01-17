package sortingAlgorithms.hospitalQueue;

import java.util.*;
public class PatientSortingbyCriticality {
	public static int [] bubbleSort(int arr[], int n) {
		boolean swap;
		for( int i=0;i<n-1; i++) {
		swap = false;
			for( int j=0; j<n-i-1; j++) {
				if( arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if( swap==false) {
				break;
			}
		}
		return arr;
	}
	
	public static void printList(int [] arr) {
		System.out.println("The sorted list according to criticality is ");
		for( int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
	
	
public static void main(String[] args) {
 Scanner input =new Scanner(System.in);
 System.out.println("===Welcome To Apolo Hospital===");	
 System.out.println("Please Enter the number the number of patients");
 int number = input.nextInt();
 int array[]= new int[number];
 System.out.println("Please enter the criticality of patient ");
 for(int i=0;i<number;i++) {
	 System.out.println("Criticality of patient "+(i+1)+ " is");
	array[i]= input.nextInt(); 
 }
 bubbleSort(array, number);
 printList(array);
 
}
}
