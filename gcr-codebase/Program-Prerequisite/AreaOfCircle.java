import java.util.Scanner;
//creating a class with name AreaOfCircle to calculate the Area of Circle
public class AreaOfCircle{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//  Declaring variables and reading  value from user
double radius, Area;
double pi=3.14;
System.out.println("Enter the radius of Circle");
radius=input.nextDouble();

//calculating the area of circle and storing it into Area variable
Area= pi* radius*radius;

//Displaying the result
System.out.println("The Resultant Area of Circle is "+Area);
input.close();
}
}
