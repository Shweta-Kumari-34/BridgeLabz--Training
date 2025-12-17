import java.util.Scanner;
//creating a class with name as PerimeterOfRectangle
public class PerimeterOfRectangle{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

// Declaring the variable and reading the value from user
double length,width,perimeter;
System.out.println("Enter The Value of Length");
length=input.nextDouble();
System.out.println("Enter The Value of Width");
width=input.nextDouble();

//calculating the perimeter of the rectangle
perimeter=2*(length+width);

//Displaying the result
System.out.println("The resultant Perimeter of the Rectangle is "+perimeter);
input.close();
}
}
