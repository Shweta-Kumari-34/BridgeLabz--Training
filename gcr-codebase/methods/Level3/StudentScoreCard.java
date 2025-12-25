import java.util.Random;
import java.util.Scanner;
//creating a class with name as StudentScoreCard
public class StudentScoreCard {

// Method to generate random 2-digit PCM marks
public static int[][] generatePCMMarks(int students) {
Random random = new Random();
int[][] marks = new int[students][3]; // P, C, M

for (int i = 0; i < students; i++) {
for (int j = 0; j < 3; j++) {
marks[i][j] = random.nextInt(90) + 10; // 10–99
}
}
return marks;
}
    
// Method to calculate total, average, percentage
public static double[][] calculateResults(int[][] marks) {
int students = marks.length;
double[][] results = new double[students][3]; // total, average, percentage

for (int i = 0; i < students; i++) {
int total = marks[i][0] + marks[i][1] + marks[i][2];
double average = total / 3.0;
double percentage = (total / 300.0) * 100;
//storitg result by rounding the values
results[i][0] = total;
results[i][1] = Math.round(average);
results[i][2] = Math.round(percentage);
}
return results;
}

// Method to calculate grade
public static String getGrade(double percentage) {
if (percentage >= 80) return "A";
else if (percentage >= 70) return "B";
else if (percentage >= 60) return "C";
else if (percentage >= 50) return "D";
else if (percentage >= 40) return "E";
else return "R";
}

// Method to display scorecard of students
public static void displayScoreCard(int[][] marks, double[][] results) {
System.out.println("\nID\tPhysics\tChem\tMath\tTotal\tAvg\t% \tGrade");
        System.out.println("---------------------------------------------------------------");

for (int i = 0; i < marks.length; i++) {
String grade = getGrade(results[i][2]);
System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.0f\t%.0f\t%s\n",(i + 1),marks[i][0], marks[i][1],marks[i][2],results[i][0],results[i][1],results[i][2],grade);
}
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter t he number of student ");
int students = input.nextInt();

int[][] marks = generatePCMMarks(students);
double[][] results = calculateResults(marks);

displayScoreCard(marks, results);

input.close();
}
}