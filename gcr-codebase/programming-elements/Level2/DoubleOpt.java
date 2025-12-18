import java.util.Scanner;
//Creating a class with name as IntOperation
public class DoubleOpt{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//reading input from user
System.out.println("Enter  the value of a ");
double a = input.nextDouble();
System.out.println("Enter  the value of b ");
double b = input.nextDouble();
System.out.println("Enter  the value of c ");
double c = input.nextDouble();

//performing integer operations
double result1 = a + b * c;
double result2 = a * b + c;
double result3 = c + a / b ;

//displaying result
System.out.println("The results of Int Operations are " + result1 + " , " +result2+ ", and " +result3);
input.close();
}
}
