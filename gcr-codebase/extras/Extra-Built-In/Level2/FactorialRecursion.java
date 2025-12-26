import java.util.Scanner;
//creatin a class with name as FactorialRecursion
public class FactorialRecursion {

// Recursive method to calculate factorial
public static long factorial(int n) {
if (n <= 1) return 1;
return n * factorial(n - 1);
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();

//calling method and storing the result
long result = factorial(num);

//displaying result
System.out.println("Factorial of " + num + " is " + result);

input.close();
}
}
