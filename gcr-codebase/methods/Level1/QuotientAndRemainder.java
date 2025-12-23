import java.util.Scanner;
//Creating a class with name as QuotientAndRemainder
//to find the qoutient and remainder of number
public class QuotientAndRemainder{
public static int[] findRemainderAndQuotient(int number, int divisor) {
int quotient =number / divisor;
int remainder =number%divisor;
return  new int[]{quotient, remainder};
}

public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring variables and reading input from the user
int number1, number2;
System.out.println("Enter the first number value ");
number1=input.nextInt();
System.out.println("Enter the second number value ");
number2=input.nextInt();

//calling the method and storing the result
int []result=findRemainderAndQuotient(number1, number2);

//displaying the result
System.out.println("The Quotient is " +result[0]);
System.out.println("The remainder is " +result[1] );
input.close();
}
}
