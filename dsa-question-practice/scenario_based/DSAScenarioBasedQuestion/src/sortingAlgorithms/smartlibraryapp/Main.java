package sortingAlgorithms.smartlibraryapp;

public class Main {
	public static void main(String [] args) {
		System.out.println("********************Welcome To SmartLibrary App *********************");
		User[] list= {
				new User("The Silent Forest" , "Aarav Sharma" ) ,
				new User("Echoes of Time" , "Ananya Verma"),
				new User("Journey Beyond the Stars" , "Rohan Gupta"),
				new User("Whispers in the Wind", "Priya Mehta" ),
				new User("Shadows of the Past","Kunal Singh" ),
				new User("The Lost Kingdom" ,"Neha Kapoor" ),
				new User("Dreams of Tomorrow" , "Aman Patel"),
				new User("Secrets Beneath the Sea", "Sanya Malhotra"),
		};
		
		InsertionSort.printUserList( list, "List Before Sorting ");
		InsertionSort.insertionSort( list);
		
		InsertionSort.printUserList( list, "List After Sorting ");
		System.out.println("****************************Thank You !!!*****************************");
		System.out.println("****************************Visit Again*******************************");
}
}
