import java.util.Scanner;
//creating a class with name as ArrayIndexOutOfBoundsProgram
public class ArrayIndexOutOfBoundsProgram {

// Method to generate ArrayIndexOutOfBoundsException
public static void generateException(String[] names) {
// Accessing index beyond array length
System.out.println("Name at invalid index: " + names[names.length]);
}

// Method to handle ArrayIndexOutOfBoundsException
public static void handleException(String[] names) {

try {
System.out.println("Name at invalid index: " + names[names.length]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException is thrown");
} catch (RuntimeException e) {
}
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

// reading array size from user
System.out.print("Enter number of names: ");
int n = input.nextInt();

String[] names = new String[n];

// Taking names input
for (int i = 0; i < n; i++) {
System.out.print("Enter name " + (i + 1) + ": ");
names[i] = input.next();
}

// Calling method to generate exception
try {
generateException(names);
} catch (RuntimeException e) {
System.out.println("Exception generated in generateException() method.");
}

System.out.println("\nRefactored code with exception handling:\n");

// Calling method to handle exception
handleException(names);

input.close();
}
}
