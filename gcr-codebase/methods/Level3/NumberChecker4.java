import java.util.Scanner;
// Creating NumberChecker utility class
public class NumberChecker4 {

// Method to check if a number is prime
public static boolean isPrime(int number) {
if (number <= 1) return false;
for (int i = 2; i <= Math.sqrt(number); i++) {
if (number % i == 0) return false;
}
return true;
}

// Method to check if a number is neon
public static boolean isNeon(int number) {
int square = number * number;
int sum = 0;
while (square != 0) {
sum += square % 10;
square /= 10;
}
return sum == number;
}

// Method to check if a number is a spy number
public static boolean isSpy(int number) {
int sum = 0;
int product = 1;
int temp = number;
while (temp != 0) {
int digit = temp % 10;
sum += digit;
product *= digit;
temp /= 10;
}
return sum == product;
}

// Method to check if a number is automorphic
public static boolean isAutomorphic(int number) {
int square = number * number;
String numStr = Integer.toString(number);
String squareStr = Integer.toString(square);
return squareStr.endsWith(numStr);
}

// Method to check if a number is buzz
public static boolean isBuzz(int number) {
return number % 7 == 0 || number % 10 == 7;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.print("Enter a number: ");
int number = input.nextInt();

//displaying the rseult
// Prime check
System.out.println("Is Prime: " + isPrime(number));

// Neon check
System.out.println("Is Neon: " + isNeon(number));

// Spy number check
System.out.println("Is Spy Number: " + isSpy(number));

// Automorphic check
System.out.println("Is Automorphic Number: " + isAutomorphic(number));

// Buzz number check
System.out.println("Is Buzz Number: " + isBuzz(number));

input.close();
}
}
