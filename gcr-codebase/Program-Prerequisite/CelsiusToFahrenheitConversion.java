import java.util.Scanner;
public class CelsiusToFahrenheitConversion{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
double Celsius, Fahrenheit;
System.out.println("Enter Temperature in Celsius");
Celsius=input.nextDouble();
Fahrenheit=(Celsius * 9/5) + 32;
System.out.println("The converted temperature in Fahrenheit is "+Fahrenheit);
}
}
