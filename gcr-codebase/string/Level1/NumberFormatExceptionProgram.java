import java.util.Scanner;
//creating a class with name as NumberFormatExceptionProgram
public class NumberFormatExceptionProgram {

// Method to generate NumberFormatException
public static void generateException(String text) {
// This will throw NumberFormatException if text is not a number
int number = Integer.parseInt(text);
System.out.println("Number is: " + number);
}

// Method to handle NumberFormatException
public static void handleException(String text) {

try {
int number = Integer.parseInt(text);
System.out.println("Number is: " + number);
} catch (java.lang.NumberFormatException e) {
System.out.println("NumberFormatException is thrown");
} catch (RuntimeException e) {
System.out.println("Generic RuntimeException is thrown");
}
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

//reading user input as String
System.out.print("Enter a value: ");
String text = input.next();

// Calling method to generate exception
try {
generateException(text);
} catch (RuntimeException e) {
System.out.println("Exception is generated in generateException() method.");
}

System.out.println("\nRefactored code with exception handling:\n");

// Calling method to handle exception
handleException(text);

input.close();
}
}
