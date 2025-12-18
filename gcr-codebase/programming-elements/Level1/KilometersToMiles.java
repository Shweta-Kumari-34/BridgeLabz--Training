//Creating a class with name as KilometersToMiles
import java.util.Scanner;
public class KilometersToMiles{
public static void main(String[]args){
double km;
Scanner input=new Scanner(System.in);

//Taking input in Kilometers
//Converting Kilometers to Miles
System.out.println("Enter distance in kilometers ");
km = input.nextDouble();
double miles = km / 1.6 ;

//displaying the result
System.out.println("The total miles  is  " + miles +" mile for the given " + km + " km");
}
}
