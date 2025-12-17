import java.util.Scanner;
//creating class named as CelsiusToFahrenheitConversion
public class CelsiusToFahrenheitConversion{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

//Declaring the variable and reading input from the user
double celsius, fahrenheit;
System.out.println("Enter Temperature in Celsius");
celsius=input.nextDouble();

//converting the celsius tempetature into fahrenheit
fahrenheit=(celsius * 9/5) + 32;

//displaying the result
System.out.println("The converted temperature in Fahrenheit is "+fahrenheit);
input.close();
}
}
