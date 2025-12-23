import java.util.Scanner;
import java.util.Arrays;
//creating a class with name as NumberFactorTask
public class  NumberFactorTask {
// Method to find factors of a number and return as an array
public static int[] findFactors(int number) {
// First, count the number of factors
int count = 0;
for (int i = 1; i <= number; i++) {
if (number % i == 0) count++;
}

//store factors in an array
int[] factors = new int[count];
int index = 0;
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
factors[index++] = i;
}
}
return factors;
}

// Method to find the greatest factor
public static int greatestFactor(int[] factors) {
int max = factors[0];
for (int f : factors) {
if (f > max) max = f;
}
return max;
}

// Method to find the sum of factors
public static int sumOfFactors(int[] factors) {
int sum = 0;
for (int f : factors) sum += f;
return sum;
}

// Method to find the product of factors
public static long productOfFactors(int[] factors) {
long product = 1;
for (int f : factors) product *= f;
return product;
}

// Method to find the product of cubes of factors
public static double productOfCubes(int[] factors) {
double product = 1;
for (int f : factors) product *= Math.pow(f, 3);
return product;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

// Find factors
int[] factors = findFactors(number);
System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

// Greatest factor
System.out.println("Greatest Factor: " + greatestFactor(factors));

// Sum of factors
System.out.println("Sum of Factors: " + sumOfFactors(factors));

// Product of factors
System.out.println("Product of Factors: " + productOfFactors(factors));

// Product of cubes of factors
System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

input.close();
}
}
