import java.util.Scanner;
public class AreaOfCircle{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
double radius, Area;
double pi=3.14;
System.out.println("Enter the radius of Circle");
radius=input.nextDouble();
Area= pi* radius*radius;
System.out.println("The Resultant Area of Circle is "+Area);
}
}
