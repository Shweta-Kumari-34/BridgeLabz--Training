import java.util.Scanner;
//Creating a class with name as BasicCalculator
public class BasicCalculator{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//taking input from uesr
double number1, number2;
System.out.println("Enter number1 value ");
number1=input.nextDouble();
System.out.println("Enter number2 value ");
number2= input.nextDouble();
double addition, subtraction, multiplication , division;

//performing arithmetic operations
addition = number1 + number2;
subtraction = number1 - number2;
multiplication= number1 * number2;
division = number1 / number2;

//displaying result
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers  " +number1+ " and " + number2 + " is " + addition +"," +subtraction +"," + multiplication +" and " + division );
input.close();
}
}
