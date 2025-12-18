import java.util.Scanner;
//Creating a class with name as AreaOfTriangle
public class AreaOfTriangle{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//taking user input
System.out.println("Enter base value in inches ");
double base =input.nextDouble();
System.out.println("Enter height value in inches ");
double height =input.nextDouble();

//calculating area 
double areaInSquareInches = 0.5f * base * height;
//1 inch=2.54 cm
double areaInSquareCm = areaInSquareInches * 2.54f *2.54f;

//displaying result
System.out.println(" Area in square inches is " + areaInSquareInches+ "  Area in square centimeters is " + areaInSquareCm);
input.close();
}
}
