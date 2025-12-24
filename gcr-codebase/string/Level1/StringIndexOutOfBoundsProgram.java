import java.util.Scanner;
//creating a class with name as StringIndexOutOfBoundsProgram
public class StringIndexOutOfBoundsProgram {

// Method to generate StringIndexOutOfBoundsException
public static void generateException(String text) {
// Accessing index beyond string length 
System.out.println("Character at invalid index " + text.charAt(text.length()));
}

// Method to handle StringIndexOutOfBoundsException
public static void handleException(String text) {

try {
System.out.println("Character at invalid index: " + text.charAt(text.length()));
}catch (StringIndexOutOfBoundsException e) {
System.out.println("StringIndexOutOfBoundsException occur");
}
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//Taking user input
System.out.print("Enter a string: ");
String text = input.next();

// Calling method to generate exception
try {
generateException(text);
} catch (StringIndexOutOfBoundsException e) {
System.out.println("Exception generated in generateException() method.");
}

System.out.println("Refactored code with exception handling");

// Calling method to handle exception
handleException(text);

input.close();
}
}

