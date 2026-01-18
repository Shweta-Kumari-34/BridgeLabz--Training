package sortingAlgorithms.sortArtistsbyRegistrationTime;
import java.util.*;
public class ArtExpo {
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
	System.out.println("=====Welcome ArtExpo=====");
	System.out.println("Provide the artist registration details");
	System.out.println("Enter the number of artist");
	int number = input.nextInt();
	String [] registrationTime= new String [number];
	for( int i=0; i<number;i++) {
		System.out.println("Enter the registration time of artist(Hrs-Min-Sec) " + (i+1));
		registrationTime[i]= input.next();
	}
	
	insertionSort(registrationTime , number);
	printList(registrationTime);
}
}
