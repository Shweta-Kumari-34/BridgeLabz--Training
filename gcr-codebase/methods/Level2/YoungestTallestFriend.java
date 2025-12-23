import java.util.Scanner;
// Creating class with name as YoungestTallestFriend 
public class YoungestTallestFriend {
// Method to find the youngest friend
public static String findYoungest(int[] ages, String[] names) {
int minAge = ages[0];
int index = 0;
for (int i = 1; i < ages.length; i++) {
if (ages[i] < minAge) {
 minAge=ages[i];
}
}
return names[index];
}

//Method to find the tallest friend
public static String findTallest(double[] heights, String[] names) {
double maxHeight = heights[0];
int index = 0;
for (int i = 1; i < heights.length; i++) {
if(heights[i] > maxHeight) {
maxHeight = heights[i];
index = i;
}
}
return names[index];
} 

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
// Names of friends
String[] names = {"Amar", "Akbar", "Anthony"};

// Arrays to store ages and heights
int[] ages = new int[3];
double[] heights = new double[3];

// Taking user input
for (int i = 0; i < 3; i++) {
System.out.print("Enter age of " + names[i] + ": ");
ages[i] = input.nextInt();
System.out.print("Enter height of " + names[i] + " (in cm) ");
heights[i]= input.nextDouble();
}

// Finding youngest and tallest
String youngest = findYoungest(ages, names);
String tallest = findTallest(heights, names);

// Displaying results
System.out.println("Youngest friend is: " + youngest);
System.out.println("Tallest friend is: " + tallest);
input.close();
}
}
