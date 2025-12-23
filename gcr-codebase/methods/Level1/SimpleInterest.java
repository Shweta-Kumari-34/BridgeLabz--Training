
import java.util.Scanner;
//creating a class with name as SimpleInterest
public class SimpleInterest {

//method to calculate the simple interest
public static double simpleInterest(int principal, int rate, int time) {
double simpleInterest = (principal * rate * time) / 100.0;
return simpleInterest;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter the principal amount");
int principal = input.nextInt();
System.out.println("Enter the value of Rate");
int rate = input.nextInt();
System.out.println("Enter time duration");
int time = input.nextInt();
double result = simpleInterest(principal, rate, time);
System.out.println( "The Simple Interest is " + result +
" for principal " + principal + " for interest rate " + rate + " and for time  duration " + time);

input.close();
}
}

