import java.util.Scanner;
// Creating  class with name as NumberChecker6
public class NumberChecker6 {

//find sum of proper divisors
public static int sumOfProperDivisors(int number) {
int sum = 0;
for (int i = 1; i <= number / 2; i++) {
if (number % i == 0) sum += i;
}
return sum;
}

//check if a number is perfect
public static boolean isPerfect(int number) {
return number > 0 && sumOfProperDivisors(number) == number;
}

//check if a number is abundant
public static boolean isAbundant(int number) {
return number > 0 && sumOfProperDivisors(number) > number;
}

//check if a number is deficient
public static boolean isDeficient(int number) {
return number > 0 && sumOfProperDivisors(number) < number;
}

//find factorial of a digit
public static int factorial(int n) {
int fact = 1;
for (int i = 2; i <= n; i++) fact *= i;
return fact;
}

//check if a number is strong
public static boolean isStrong(int number) {
int sum = 0;
int temp = number;
while (temp != 0) {
int digit = temp % 10;
sum += factorial(digit);
 temp /= 10;
}
return sum == number;
}

// Main method
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number= input.nextInt();  
    
//Displaying the result  
//Perfect number check
System.out.println("Is Perfect Number: " + isPerfect(number));

// Abundant number check
System.out.println("Is Abundant Number: " + isAbundant(number));

// Deficient number check
System.out.println("Is Deficient Number: " + isDeficient(number));

// Strong number check
System.out.println("Is Strong Number: " + isStrong(number));

input.close();
}
}
