import java.util.Scanner;
//Creating a class with name as  BMI2DCalculation
public class BMI2DCalculation{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables
System.out.println("Enter the number of person ");
int number= input.nextInt();
double[][] personData = new double[number][3];
String[] weightStatus = new String[number];

//Reading user  positive input
for( int i = 0; i < number ; i++){
do {
System.out.print("Enter height in meters: ");
personData[i][0] = input.nextDouble();
}while (personData[i][0] <= 0);
do {
System.out.print("Enter weight in kg: ");
personData[i][1] = input.nextDouble();
 }while (personData[i][1] <= 0);
}

//BMI = weight / (height * height).
//calculating BMI of person and storing the status 
for( int i=0;i<number;i++){
personData[i][2]=personData[i][1]/(personData[i][0] * personData[i][0]);
if (personData[i][2] <= 18.4){
weightStatus[i]= " Underweight";
}
else if (personData[i][2] <=24.9  && personData[i][2] >= 18.5){
weightStatus[i]=" Normal";
}
else if (personData[i][2] <=39.9 && personData[i][2] >= 25.0){
weightStatus[i]=" Overweight";
}
else {
weightStatus[i]=" Obese ";
}
}

//displaying  the result
System.out.println("\n The height, weight, BMI, and weight status of each person are ");
for( int i=0;i<number;i++){
System.out.println(
" height is "+personData[i][0] +
" weight is "+ personData[i][1]+ 
" bmi is " + personData[i][2] + 
" status is " + weightStatus[i]
);
}
input.close();
}
}






