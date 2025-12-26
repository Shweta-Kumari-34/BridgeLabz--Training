import java.util.Random;
//creating a class with name as StudentScorecard
public class StudentScorecard {

//generate random scores for n students of  2-digit
// Returns 2D array: [n][3] for Physics, Chemistry, Math
public static int[][] generateScores(int n) {
int[][] scores = new int[n][3];
Random rand = new Random();

//storing the scores in array
for (int i = 0; i < n; i++) {
scores[i][0] = rand.nextInt(61) + 40; // Physics (40-100)
scores[i][1] = rand.nextInt(61) + 40; // Chemistry
scores[i][2] = rand.nextInt(61) + 40; // Math
}

return scores;
}

//calculating total, average, percentage vlaue
// Returns 2D array [n][3] store total, average, percentage
public static double[][] calculateTotalAveragePercentage(int[][] scores) {
int n = scores.length;
double[][] results = new double[n][3];

for (int i = 0; i < n; i++) {
int total = scores[i][0] + scores[i][1] + scores[i][2];
double average = total / 3.0;
double percentage = (total / 300.0) * 100;

results[i][0] = Math.round(total * 100.0) / 100.0;
results[i][1] = Math.round(average * 100.0) / 100.0;
results[i][2] = Math.round(percentage * 100.0) / 100.0;
}

return results;
}

// Method to calculate grades based on percentage
public static String[] calculateGrades(double[][] results) {
int n = results.length;
String[] grades = new String[n];
for (int i = 0; i < n; i++) {
double percentage = results[i][2];

//checking the conditions
if (percentage >= 80) grades[i] = "A";
else if (percentage >= 70) grades[i] = "B";
else if (percentage >= 60) grades[i] = "C";
else if (percentage >= 50) grades[i] = "D";
else if (percentage >= 40) grades[i] = "E";
else grades[i] = "R";
}

return grades;
}

// Method to display scorecard
public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
for (int i = 0; i < scores.length; i++) {
System.out.println((i+1) + "\t" + scores[i][0] + "\t" +scores[i][1] + "\t\t" +scores[i][2] + "\t" + results[i][0] + "\t" +results[i][1] + "\t" +results[i][2] + "\t\t" +grades[i]);
}
}

public static void main(String[] args) {

int n = 10; // Number of students

//calling the respective methods and storing the result
int[][] scores = generateScores(n);
double[][] results = calculateTotalAveragePercentage(scores);
String[] grades = calculateGrades(results);

//displaying the result
displayScorecard(scores, results, grades);
}
}
