import java.util.Scanner;
//Creating a class with name as QuotientReminder
public class QuotientReminder{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//taking input from user
System.out.println("Enter  the first number ");
int number1 =input.nextInt();
System.out.println("Enter  the second number ");
int number2 =input.nextInt();

//calculating quotient and remainder
int quotient =number1 / number2;
int remainder =number1 % number2;

//displaying the result
System.out.println("The Quotient is  " + quotient+" and Reminder is " +remainder +" of two number " + number1 + " and "+number2 );
input.close();
}
}





