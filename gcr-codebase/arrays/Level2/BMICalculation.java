import java.util.Scanner;
//Creating a class with name as BMICalculation
public class BMICalculation{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables
System.out.println("Enter the number of person ");
int n= input.nextInt();
double []height= new double[n];
double []weight= new double[n];
double []bmi= new double[n];
String []status= new String[n];

//Reading user input
for( int i=0;i<n;i++){
System.out.println("Enter height of person  ");
height[i]=input.nextDouble();
System.out.println("Enter weight of person");
weight[i] =input.nextDouble();
}

//BMI = weight / (height * height).
//calculating BMI of person and storing the status 
for( int i=0;i<n;i++){
bmi[i] = weight[i]/ (height[i] * height[i] ) ;
if (bmi[i] <= 18.4){
status[i]= " Underweight";
}
else if (bmi[i] <=24.9  && bmi[i] >= 18.5){
status[i]=" Normal";
}
else if (bmi[i] <=39.9 && bmi[i] >= 25.0){
status[i]=" Overweight";
}
else {
status[i]=" Obese ";
}
}

//displaying  the result
System.out.println("height weight, BMI, and weight status of each person ");
for( int i=0;i<n;i++){
System.out.println( "height is "+height[i] +" weight is "+ weight[i]+ "  bmi is " + bmi[i] + " status is " +status[i]);
}
input.close();
}
}






