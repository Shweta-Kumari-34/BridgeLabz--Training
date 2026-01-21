package sortingAlgorithms.theatershowlistings;

import java.util.Scanner;
public class  Main{
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
	for( int i=0;i<array.length; i++) {
		System.out.print(array[i]+ " , ");
	}
}
	
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("=====Welcome Corals=====");
	System.out.println("Provide the movie details");
	System.out.println("Enter the number of movie");
	int number = input.nextInt();
	String [] showTime= new String [number];
	for( int i=0; i<number;i++) {
		System.out.println("Enter the showtime time of "+ (i+1)+" movie(Hrs-Min-Sec) in 24hrs format");
		showTime[i]= input.next();
	}
	
	insertionSort(showTime , number);
	printList(showTime);
}
}