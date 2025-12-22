import java.util.Scanner;
//creating class with name as LargestSecondLargestMaxDigit
public class LargestSecondLargestMaxDigit {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//reading user input
System.out.println("Enter a number:");
int number = input.nextInt();

number = Math.abs(number); // handle negative numbers
int maxDigit = 10;
int[] digits = new int[maxDigit];

int index = 0;

//store digit of number
while (number != 0) {
//If array is full, increase size by 10
if (index == maxDigit) {
maxDigit = maxDigit + 10;      // increase size
int[] temp = new int[maxDigit];
// copy old data to new array
for (int i = 0; i < digits.length; i++) {
temp[i] = digits[i];
}
digits = temp; //copying  the temp 
}
digits[index] = number % 10; // remove  digit and store
number = number / 10;         // remove last digit from number
index++;
}

//Finding largest and second largest digit
int largest = 0;
int secondLargest = 0;

for (int i = 0; i < index; i++) {
if (digits[i] > largest) {
secondLargest = largest;
largest = digits[i];
} 
else if (digits[i] > secondLargest && digits[i] != largest) {
secondLargest = digits[i];
}
}

//Displaying the result
System.out.println("Largest digit: " + largest);
System.out.println("Second largest digit: " + secondLargest);

input.close();
}
}
