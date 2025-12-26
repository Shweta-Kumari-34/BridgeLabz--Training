import java.util.Scanner;
//creating a class with name as PrimeNumberChecker
public class PrimeNumberChecker {

//check whether a number is prime
public static boolean isPrime(int num) {
if (num <= 1) return false;
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) return false;
}
return true;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.print("Enter a number to check if it is prime: ");
int num = input.nextInt();

//checking conditions and displaying the result
if (isPrime(num)) {
System.out.println(num + " is a prime number.");
} else {
System.out.println(num + " is not a prime number.");
}

input.close();
}
}
