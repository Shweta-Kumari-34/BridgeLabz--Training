//Creating a class with name as EarthVolume
public class EarthVolume{
public static void main(String[]args){

//radius in kilometers
double radius=6378;
//volume in cubic kilometers to cubic miles
Double baseValue=0.239913;
double volumeKm= (4.0/3.0)*Math.PI*radius*radius*radius;
double voulumeMiles= volumeKm * baseValue ;

//displaying the result
System.out.println("The volume of earth in cubic kilometers is  " + volumeKm +" and cubic miles is " + voulumeMiles);
}
}
