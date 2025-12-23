import java.util.Scanner;
// Creating class with name as BMICalculation
public class BMICalculation {

// Method to calculate BMI
public static void calculateBMI(double[][] data) {
for (int i = 0; i < data.length; i++) {
double weight = data[i][0];      // weight in kg
double heightCm = data[i][1];    // height in cm
// Convert height from cm to meters
double heightMeter = heightCm / 100;
// BMI formula
double bmi = weight / (heightMeter * heightMeter);
//Store BMI in 3rd column
data[i][2] = bmi;
}
}

//Method to determine BMI status
public static String[] getBMIStatus(double[][] data) {

String[] status = new String[data.length];
for (int i = 0; i < data.length; i++) {
double bmi = data[i][2];

//checking the condition and storing the status
if (bmi < 18.5) {
status[i] = "Underweight";
} else if (bmi >= 18.5 && bmi < 25) {
status[i] = "Normal";
} else if (bmi >= 25 && bmi < 30) {
status[i] = "Overweight";
} else {
 status[i] = "Obese";
}
}
return status;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);


//declaring array
double[][] persons = new double[10][3];
// Taking user input
for (int i = 0; i < 10; i++) {
System.out.println("Enter details for Person " + (i + 1));
System.out.print("Enter weight kg ");
persons[i][0] = input.nextDouble();
System.out.print("Enter height  in cm ");
persons[i][1] = input.nextDouble();
}

// Calculate BMI
calculateBMI(persons);
// Get BMI status
String[] bmiStatus = getBMIStatus(persons);

// Display results
System.out.println("The BMI of the person is ");
for (int i = 0; i < 10; i++) {
System.out.println("The BMI status of person "+(i+1)+" is "+ bmiStatus[i] );
}
input.close();
}
}
