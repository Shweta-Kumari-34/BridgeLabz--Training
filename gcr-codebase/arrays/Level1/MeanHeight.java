import java.util.Scanner;
//Creating a class with name as MeanHeight
public class MeanHeight{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//reading height of player
double [] heights = new double [11] ;
double sum = 0.0;
for( int i=0; i <11; i++){
System.out.println("Enter " + (i+1) +" player height  "  );
heights[i] = input.nextDouble();
sum += heights[i];
}

//calculating mean and displaying result
double mean= sum /11;
System.out.println(" mean height of the football team is " + mean );
input. close();
}
}