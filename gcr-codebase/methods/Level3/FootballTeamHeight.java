// Creating class with name as FootballTeamHeight
public class FootballTeamHeight {

// Method to generate random heights between 150 and 250 cm
public static int[] generateHeights(int size) {
int[] heights = new int[size];

for (int i = 0; i < heights.length; i++) {
// Random 3-digit height between 150 and 250
heights[i] = (int) (Math.random() * 101) + 150;
}

return heights;
}

//Method to find sum of all heights
public static int findSum(int[] heights) {
int sum = 0;
for (int h : heights) {
sum += h;
}
return sum;
}

// Method to find mean height
public static double findMean(int[] heights) {
int sum = findSum(heights);
return (double) sum / heights.length;
}

// Method to find shortest height
public static int findShortest(int[] heights) {
int min = heights[0];
for (int h : heights) {
if (h < min) {
 min = h;
}
}
return min;
}

// Method to find tallest height
public static int findTallest(int[] heights) {
int max = heights[0];
for (int h : heights) {
 if (h > max) {
max = h;
}
}
return max;
}

// Main method
public static void main(String[] args) {

// Create heights array for 11 players
int[] heights = generateHeights(11);

// Display player heights
System.out.println("Heights of football players in cm");
for (int i = 0; i < heights.length; i++) {
System.out.println("Player " + (i + 1) + ": " + heights[i]);
}

 // calling the method and storing the result
int sum = findSum(heights);
double mean = findMean(heights);
int shortest = findShortest(heights);
int tallest = findTallest(heights);

// Displaying the  final results
System.out.println("Sum of Heights: " + sum + " cm");
System.out.println("Mean Height: " + mean + " cm");
System.out.println("Shortest Player Height: " + shortest + " cm");
System.out.println("Tallest Player Height: " + tallest + " cm");
}
}

