package sortingAlgorithms.icecreamrushapp;

public class BubbleSort {
public static void bubbleSort(IceCream[] flavors) {
	int n= flavors.length;
	
	for( int i=0; i<n-1;i++) {
		for( int j=0;j<n-i-1;j++) {
			if(flavors[j].compareTo(flavors[j+1])<0) {
				IceCream temp= flavors[j];
				flavors[j]=flavors[j+1];
				flavors[j+1]=temp;
			}
		}
	}
}

public static void printSales(IceCream [] list, String text) {
	System.out.println( text +":");
	System.out.println("=====================================================");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Rank            Flavors                   WeeklySales");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	for( int i=0;i<list.length;i++) {
		IceCream c= list[i];
		
		System.out.printf("%-15d %-27s %d%n", (i+1), c.getName(), c.getWeeklySales());

		
	}
	System.out.println("=====================================================");
}


}
