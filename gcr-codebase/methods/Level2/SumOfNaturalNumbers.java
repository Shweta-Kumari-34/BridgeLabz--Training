import java.util.Scanner;
//creating a class with name as SumOfNaturalNumbers
public class SumOfNaturalNumbers {
//Method to calculate sum recursively
public static int sumUsingRecursion(int n) {
if (n == 1) {
return 1; // Base case
}
return n + sumUsingRecursion(n - 1); // Recursive call
}

//calculating the sum of natural number using formula
//formulae = n*(n+1)/2 
public static int sumUsingFormula(int n) {
return n * (n + 1) / 2;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// reading user input
System.out.print("Enter a natural number: ");
int number = input.nextInt();

// Checking for natural number
if (number <= 0) {
System.out.println("Please enter a valid natural number greater than 0");
return;
}

//method calling and storing the ans
int sumRecursive = sumUsingRecursion(number);
int sumFormula = sumUsingFormula(number);

// Displaying the results
System.out.println("Sum using recursion: " + sumRecursive);
System.out.println("Sum using formula: " + sumFormula);

//comparing the result and printing message
if (sumRecursive == sumFormula) {
System.out.println("Both results are equal");
} else {
System.out.println(" Both results are not equal");
}

input.close();
 }
}


