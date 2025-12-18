import java.util.Scanner;
//Creating a class with name as DistanceFind
public class DistanceFind{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//taking user input in feet
System.out.println("Enter distance in Feet ");
double distanceInFeet =input.nextDouble();

//1 yard =3 feet and 1 mile =1760 yard
double distanceInYards =distanceInFeet/3;
double distanceInMiles =distanceInYards/1760;

//displaying output
System.out.println(" distanceInYards is " + distanceInYards + " distanceInMiles is " + distanceInMiles);
input.close();
}
}


