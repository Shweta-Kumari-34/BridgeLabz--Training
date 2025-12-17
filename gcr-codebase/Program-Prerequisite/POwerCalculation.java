import java.util.Scanner;

public class POwerCalculation{
public static void main( String[]args){
Scanner input=new Scanner(System.in);
double base, exponent, result;
System.out.println( "Enter the value of the base");
base=input.nextDouble();
System.out.println("Enter the value of the expnent");
exponent=input.nextDouble();
result=Math.pow(base, exponent);
System.out.println("The resultant Power is "+result);
}
}