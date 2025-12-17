import java.util.Scanner;
public class ConvertKilometerToMiles{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
double Kilometers, Miles;
System.out.println("Enter the value of the Kilometers");
Kilometers=input.nextDouble();
Miles=Kilometers*0.621371;
System.out.println("The resultant answer after the conversion from Kilometers to Miles is "+Miles);
}
}