// Creating class with name as RandomNumberAnalysis
public class RandomNumberAnalysis {

// Method to generate array of 4-digit random numbers
public static int[] generate4DigitRandomArray(int size) {
int[] numbers = new int[size];

for (int i = 0; i < size; i++) {
// Generates random 4-digit number (1000 to 9999)
numbers[i] = (int)(Math.random() * 9000) + 1000;
}
return numbers;
}

// Method to find average, minimum and maximum
public static double[] findAverageMinMax(int[] numbers) {
int sum = 0;
int min = numbers[0];
int max = numbers[0];

for (int i = 0; i < numbers.length; i++) {
sum += numbers[i];
min = Math.min(min, numbers[i]);
max = Math.max(max, numbers[i]);
}
double average = (double) sum / numbers.length;
return new double[]{average, min, max};
}

public static void main(String[] args) {

// Generate 5 random 4-digit numbers
int[] randomNumbers = generate4DigitRandomArray(5);
// Display generated numbers
System.out.println("Generated 4-digit random numbers:");
for (int num : randomNumbers) {
System.out.println(num);
}

// Find average, min and max
double[] result = findAverageMinMax(randomNumbers);

// Display results
System.out.println("Average Value: " + result[0]);
System.out.println("Minimum Value: " + (int) result[1]);
System.out.println("Maximum Value: " + (int) result[2]);
}
}
