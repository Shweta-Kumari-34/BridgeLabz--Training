package sortingAlgorithms.realTimeBookArrangement;

import java.util.Scanner;

public class SmartShelf {
	public static String[]insertionSort(String[] book , int n){
		for( int i=1;i<n;i++) {
			String curr= book[i];
			int prev = i-1;
			while( prev>=0 && book[prev].compareToIgnoreCase(curr)>0) {
				book [prev+1]=book[prev];
				prev--;
			}
			book[prev+1]=curr;
		}
		return book;
	}
	public static void printSortedBookList(String []book) {
		for( int i=0;i<book.length; i++) {
			System.out.println(book[i]);
		}
	}
public static void main( String [] args) {
	Scanner input=new Scanner (System.in);

	System.out.println("Welcome to Smart Shelf");
	System.out.println("Enter the number of book");
	int number= input.nextInt();
	String []book= new String[number];
	System.out.println("Please enter the book title");
	for( int i=0;i<number;i++) {
		System.out.println("Enter the title of book"+(i+1)+" ");
		book[i]=input.next();
	}
	insertionSort(book,  number);
	printSortedBookList(book);
	
	
}
}
