//creating a class with name as NullPointerExceptionDemo
public class NullPointerExceptionProgram {

// Method to generate NullPointerException
public static void generateException() {
String text = null;   // initializing string to null
// Calling a String method on null reference
System.out.println("Length of text " + text.length());
}

// Method to handle NullPointerException
public static void handleException() {
String text = null;   // initializing string to null
try {
System.out.println("Length of text is " + text.length());
} catch (NullPointerException e) {
System.out.println("NullPointerException is thrown " +e);
}
}

public static void main(String[] args) {

//Calling method to generate exception
try {
generateException();
} catch (NullPointerException e) {
System.out.println("Exception generated in generateException() method" +e);
}

System.out.println("Refactored code with exception handling");
//Calling method that handles the exception
handleException();
}
}
