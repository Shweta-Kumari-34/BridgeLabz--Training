import java.util.Scanner;
//creating a class with name as PowerCalculation
public class PowerCalculation{
public static void main( String[]args){
Scanner input=new Scanner(System.in);

//declaring variable and reading value form the user
double base, exponent, result;
System.out.println( "Enter the value of the base");
base=input.nextDouble();
System.out.println("Enter the value of the expnent");
exponent=input.nextDouble();

//calculating the power using Math.pow()
result=Math.pow(base, exponent);

//Displaying the result
System.out.println("The resultant Power is "+result);
input.close();
}
}