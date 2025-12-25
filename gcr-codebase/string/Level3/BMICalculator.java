import java.util.Scanner;
//creating a class with name as BMICalculator
public class BMICalculator {

// Method to calculate BMI and determine status
// Returns a 2D String array [1][2] that contains BMI and Status
 public static String[] calculateBMIStatus(double weightKg, double heightCm) {

double heightM = heightCm / 100.0; // convert cm to meters
double bmi = weightKg / (heightM * heightM);
bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

String status;
if (bmi < 18.5) status = "Underweight";
else if (bmi < 25) status = "Normal";
else if (bmi < 30) status = "Overweight";
else status = "Obese";
return new String[]{String.format("%.2f", bmi),status};
}

//process all persons and return 2D array of height, weight, BMI, Status
public static String[][] processTeam(double[][] heightWeight) {
int n = heightWeight.length;
String[][] result = new String[n][4]; // Height, Weight, BMI, Status

for (int i = 0; i < n; i++) {
double weight = heightWeight[i][0];
double height = heightWeight[i][1];

String[] bmiStatus = calculateBMIStatus(weight, height);

result[i][0] = String.valueOf(height);
result[i][1] = String.valueOf(weight);
result[i][2] = bmiStatus[0];
result[i][3] = bmiStatus[1];
}

return result;
}

//display the 2D array in tabular format
public static void displayBMI(String[][] data) {
System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

for (int i = 0; i < data.length; i++) {
System.out.println((i + 1) + "\t" + data[i][0] + "\t\t" +data[i][1] + "\t\t" +data[i][2] + data[i][3]);
}
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int n = 10; // Number of team members
double[][] heightWeight = new double[n][2];

// reading height and weight for each person from user
for (int i = 0; i < n; i++) {
System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
heightWeight[i][0] = sc.nextDouble();
System.out.print("Enter height (cm) of person " + (i+1) + ": ");
heightWeight[i][1] = sc.nextDouble();
}

// Process BMI and Status
String[][] bmiData = processTeam(heightWeight);

// calling method for displaying results
displayBMI(bmiData);

sc.close();
    }
}
