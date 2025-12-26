import java.util.Scanner;
//creating a class with name as FibonacciSequenceGenerator
public class FibonacciSequenceGenerator {

//generate and print Fibonacci sequence
public static void printFibonacci(int terms) {
int a = 0, b = 1;
System.out.print("Fibonacci sequence: ");
for (int i = 1; i <= terms; i++) {
System.out.print(a + " ");
int next = a + b;
a = b;
b = next;
}
System.out.println();
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading input from user
System.out.print("Enter number of terms: ");
int terms = input.nextInt();

//calling methods to print the result
printFibonacci(terms);
input.close();
}
}
