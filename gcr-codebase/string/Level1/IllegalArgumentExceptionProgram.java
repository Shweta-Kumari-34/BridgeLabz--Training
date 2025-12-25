import java.util.Scanner;
//creating a class with name as IllegalArgumentExceptionProgram
public class IllegalArgumentExceptionProgram {

// Method to generate IllegalArgumentException
public static void generateException(String text) {
int start = 5;
int end = 2;

// start index is greater than end index
System.out.println("Substring: " + text.substring(start, end));
}

// Method to handle IllegalArgumentException
public static void handleException(String text) {
int start = 5;
int end = 2;

try {
System.out.println("Substring: " + text.substring(start, end));
} catch (IllegalArgumentException e) {
System.out.println("IllegalArgumentException is thrown");
} catch (RuntimeException e) {
System.out.println("Generic RuntimeException is thrown");
}
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
//reading user input
System.out.print("Enter a string: ");
String text = input.next();

// Calling method to generate exception
try {
generateException(text);
} catch (RuntimeException e) {
System.out.println("Exception  is generated in generateException() method." +e);
}

System.out.println("\nRefactored code with exception handling:\n");

handleException(text);

input.close();
}
}

