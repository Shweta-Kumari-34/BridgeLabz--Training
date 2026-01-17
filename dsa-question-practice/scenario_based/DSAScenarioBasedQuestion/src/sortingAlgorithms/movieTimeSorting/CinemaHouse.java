package sortingAlgorithms.movieTimeSorting;
import java.util.*;
public class CinemaHouse {
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
	System.out.println("Sorted movie list  is ");
		for( int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
	
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Welcome To Cinema House");
	System.out.println("Enter the number of movie");
	int number= input.nextInt();
	int []movie=new int[number];
	
	for( int i=0;i<number;i++) {
		System.out.println("enter the time of movie "+(i+1));
		movie[i]=input.nextInt();
	}
	bubbleSort(movie, number);
	 printList(movie);
	
}
}
