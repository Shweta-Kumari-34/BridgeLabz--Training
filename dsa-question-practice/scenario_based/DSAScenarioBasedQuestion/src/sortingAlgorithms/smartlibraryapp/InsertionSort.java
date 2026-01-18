package sortingAlgorithms.smartlibraryapp;

public class InsertionSort {
public static void insertionSort(User[]list ) {
	for( int i=1;i<list.length;i++) {
		User key = list[i];
		int prev= i-1;
		while( prev>=0 && list[prev].compareTo(key)>0) {
		list[prev+1]= list[prev];
		prev--;
		}
		list[prev+1]=key;
	}
}
	public static void printUserList(User [] list, String text) {
		System.out.println( text +":");
		System.out.println("==============================================================================");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("SerialNo.              BookTitle                         UserName");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for( int i=0;i<list.length;i++) {
			User c= list[i];
			
			System.out.printf("%-20s %-35s %s%n", (i+1), c.getBookTitle(), c.getUserName());

			
		}
		System.out.println("===============================================================================");
	
}
}
