import java.util.Scanner;
//creating class with name as ConvertKilometerToMiles
public class ConvertKilometerToMiles{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

// Declaring the variables and reading input from the user
double Kilometers, Miles;
System.out.println("Enter the value of the Kilometers");
Kilometers=input.nextDouble();

//converting kilometer to miles
Miles=Kilometers*0.621371;

//Displaying the result
System.out.println("The resultant answer after the conversion from Kilometers to Miles is "+Miles);
input.close();
}
}