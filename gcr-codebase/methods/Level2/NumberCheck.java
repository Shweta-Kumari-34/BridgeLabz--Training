import java.util.Scanner;
// Creating class with name as NumberCheck
public class NumberCheck{
// Method to check whether number is positive
public static boolean isPositive(int number) {
if (number >= 0) {
return true;
} else {
return false;
}
}

// Method to check whether number is even
public static boolean isEven(int number) {
if (number % 2 == 0) {
return true;
} else {
return false;
}
    }

// Method to compare two numbers
// Returns 1 if number1 > number2
// Returns 0 if both are equal
// Returns -1 if number1 < number2
public static int compare(int number1, int number2) {
if (number1 > number2) {
 return 1;
} else if (number1 == number2) {
return 0;
} else {
 return -1;
}
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
// Array to store 5 numbers
 int[] numbers = new int[5];

//reading user input
for (int i = 0; i < numbers.length; i++) {
System.out.println("Enter number " + (i + 1) );
numbers[i] = input.nextInt();
}

// Checking positive/negative and even/odd
for (int i = 0; i < numbers.length; i++) {
if (isPositive(numbers[i])) {
System.out.print(numbers[i] + " is Positive and ");
if (isEven(numbers[i])) {
 System.out.println("Even");
} else {
System.out.println("Odd");
}

} else {
System.out.println(numbers[i] + " is Negative");
}
}

// Comparing first and last element
int result = compare(numbers[0], numbers[numbers.length - 1]);
if (result == 1) {
System.out.println("First element is Greater than last element");
} else if (result == 0) {
System.out.println("First and last elements are Equal");
} else {
System.out.println("First element is Less than last element");
}

input.close();
}
}
