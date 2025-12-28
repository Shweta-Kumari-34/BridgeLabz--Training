package com.constructors.level1;

public class EBook extends Book2 {
	public EBook(String ISBN, String title, String author) {

		// calling Student class constructor
		super("123-456789", "Java Programming", "Jhon Doe" );
			}
			
			public void showEBookDetails() {
				//accessing the protected member of parent class
				System.out.println("ISBN of EBook is: "+ ISBN);	
				System.out.println("Title of EBook is : "+ title);	
				super.display();
			}
}
