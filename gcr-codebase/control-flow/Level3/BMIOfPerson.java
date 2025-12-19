import java.util.Scanner;
//Creating a class with name as BMIOfPerson
public class BMIOfPerson{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
System.out.println("Enter weight of person  in kg ");
double personWeight = input.nextDouble();
System.out.println("Enter the height of person in cm ");
double personHeightInCm =input.nextInt();

//calculating BMI of person and displaying results
double personHeightInMeter = personHeightInCm / 100;
double bmiOfPerson = personWeight * (personHeightInMeter * personHeightInMeter );
if (bmiOfPerson <= 18.4){
System.out.println(" Underweight");
}
else if (bmiOfPerson <=24.9  && bmiOfPerson >= 18.5){
System.out.println(" Normal");
}
else if (bmiOfPerson <=39.9 && bmiOfPerson >= 25.0){
System.out.println(" Overweight");
}
else {
System.out.println(" Obese ");
}
input.close();
}
}






