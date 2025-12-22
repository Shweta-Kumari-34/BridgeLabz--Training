import java.util.Scanner;

// Creating a class with name as FactorsOfNumber
public class FactorsOfNumber {
public static int[] findFactors(int number) {
int count = 0;
//calculating the number of factors
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
//incrementing the count 
count++;    
}
}
 // factors array store the factor of number 
int[] factors = new int[count];
int index = 0;

// for loop finds the factor of number and store it
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
factors[index] = i;
index++;
}
}
 return factors;
}

//calculating the sum of factors of number
public static int sumOfFactors(int[] factors) {
int sum = 0;
for (int factor : factors) {
sum += factor;
 }
 return sum;
}

//calculating the product of factors of number
public static long productOfFactors(int[] factors) {
long product = 1;
for (int factor : factors) {
product *= factor;
}
return product;
}

//calculating the sum of  the square of number
public static double sumOfSquaresOfFactors(int[] factors) {
double sumOfSquares = 0;
for (int factor : factors) {
sumOfSquares += Math.pow(factor, 2);
}
return sumOfSquares;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.print("Enter a number: ");
int number = input.nextInt();

//finding all the factors of the number
int[] factors = findFactors(number);
// Displaying factors
System.out.println("Factors of " + number + " are");
for (int i = 0; i< factors.length ;i++) {
System.out.print(factors[i] + " ");
}

//calling the methods 
int sum = sumOfFactors(factors);
long product = productOfFactors(factors);
double sumOfSquares = sumOfSquaresOfFactors(factors);

// Displaying results
System.out.println("Sum of factors: " + sum);
System.out.println("Product of factors: " + product);
System.out.println("Sum of squares of factors: " + sumOfSquares);

input.close();

}
}
