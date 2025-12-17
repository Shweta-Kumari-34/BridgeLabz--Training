import java.util.Scanner;
public class VolumeOfCylinder{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
double radius, height, Volume, pi;
pi=3.14;
System.out.println("Enter the radius of the cylinder");
radius= input.nextDouble();
System.out.println("Enter the height of the cylinder");
height=input.nextDouble();
Volume=pi*radius*radius*height;
System.out.println(" The Resultant Volume of The Cylinder is " +Volume);
}
}

