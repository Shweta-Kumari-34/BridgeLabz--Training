package sortingAlgorithms.icecreamrushapp;

public class Main {
public static void main(String [] args) {
	System.out.println("********Welcome To IcecreamRushApp*********");
	IceCream[] flavors= {
			new IceCream("Vanilla" , 221 ) ,
			new IceCream("Chocolate" ,219 ),
			new IceCream("Strawberry" , 159),
			new IceCream("Mango", 201),
			new IceCream("Kulfi", 159),
			new IceCream("Cookies & Cream" , 190),
			new IceCream("Pistachio" , 147),
			new IceCream("Black Currant", 130),
	};
	
	BubbleSort.printSales( flavors, "Popularity Before Sorting ");
	BubbleSort.bubbleSort( flavors);
	
	BubbleSort.printSales( flavors, "Popularity After Sorting ");
	System.out.println("********Thank You !!!*********");
	System.out.println("********Visit Again*********");
}
}
