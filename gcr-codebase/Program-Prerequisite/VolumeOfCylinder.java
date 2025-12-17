import java.util.Scanner;
//creating a class with name as VolumeOfCylinder
public class VolumeOfCylinder{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the variables and reading the value from the user
double radius, height, volume;
System.out.println("Enter the radius of the cylinder");
radius= input.nextDouble();
System.out.println("Enter the height of the cylinder");
height=input.nextDouble();

//calculating the volume of the cylinder
volume=Math.PI*radius*radius*height;

//Displaying the result
System.out.println(" The Resultant Volume of The Cylinder is " +volume);
input.close();
}
}

