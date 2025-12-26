import java.util.Scanner;
//creating a class with name as MaxOfThreeNumber
public class MaxOfThreeNumber {

//reading integer input from user
public static int getInput(String message, Scanner sc) {
System.out.print(message);
return sc.nextInt();
}

//find maximum of three numbers
public static int findMaximum(int a, int b, int c) {
int max = a;
if (b > max) max = b;
if (c > max) max = c;
return max;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
int num1 = getInput("Enter first number: ", input);
int num2 = getInput("Enter second number: ", input);
int num3 = getInput("Enter third number: ", input);

//calling the method and storing the result
int max = findMaximum(num1, num2, num3);

//displaying the result
System.out.println("The maximum number is: " + max);

input.close();
}
}
