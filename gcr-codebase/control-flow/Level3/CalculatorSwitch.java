import java.util.Scanner;
//Creating a class with name as  CalculatorSwitch
public class CalculatorSwitch{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
double first, second ;
String op;
System.out.println("Enter  the first number ");
first = input.nextDouble();
System.out.println("Enter  the second number ");
second = input.nextDouble();
System.out.println("Enter  the operator +, -, *, /  ");
op = input.next();

//check matched case perform calculations and print result
switch (op){
case "+":
System.out.println("Result = " + (first + second));
break;
case "-":
System.out.println("Result = " + (first - second));
break;
case "*":
System.out.println("Result = " + (first * second));
break;
case "/":
if(second !=0){
System.out.println("Result = " + (first / second));
}
else {
System.out.println("Cannot divide by zero ");
}
break;
default:
System.out.println("Invalid Operator ");
}
input.close();
}
}





