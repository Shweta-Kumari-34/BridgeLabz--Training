import java.util.Scanner;
//creating a class with name as YoungestTallestFriend 
//to find the youngest and tallest friend
public class YoungestTallestFriend {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//Friend names are stored
String[] friends = {"Amar", "Akbar", "Anthony"};
// Array to store age and height
int[] ages = new int[3];
double[] heights = new double[3];
//Take input for ages and heights
for (int i = 0; i < 3; i++) {
System.out.println("Enter age of " + friends[i]);
ages[i] = input.nextInt();
System.out.println("Enter height of " + friends[i] + " (in cm)");
heights[i] = input.nextDouble();
 }

//Find youngest friend
int youngestIndex = 0;
for (int i = 1; i < 3; i++) {
if (ages[i] < ages[youngestIndex]) {
 youngestIndex = i;
}
}

//Find tallest friend
int tallestIndex = 0;
for (int i = 1; i < 3; i++) {
if (heights[i] > heights[tallestIndex]) {
tallestIndex = i;
}
}

//Displaying the results
System.out.println("The youngest friend among three is "+ friends[youngestIndex]);
System.out.println("The tallest friend among three is "+ friends[tallestIndex]);
input.close();
}
}

