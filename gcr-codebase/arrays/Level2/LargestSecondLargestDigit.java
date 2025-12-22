import java.util.Scanner;
//creating class as LargestSecondLargestDigit
public class LargestSecondLargestDigit{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

//Reading user input
System.out.println("Enter a number:");
int number = input.nextInt();
number = Math.abs(number); // handle negative numbers

//Define array to store digits   
int maxDigit = 10;
int[] digits = new int[maxDigit];
int index = 0;

//Store digits in array
while (number != 0) {
if (index == maxDigit) {
break; // stop if array is full
}
digits[index] = number % 10; // get last digit
number = number / 10;         // remove last digit
index++;          
}
index++;

//Find largest and second largest digit
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
