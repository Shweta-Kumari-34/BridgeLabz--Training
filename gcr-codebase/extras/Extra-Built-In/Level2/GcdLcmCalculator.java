import java.util.Scanner;
//creating a class with name as GcdLcmCalculator
public class GcdLcmCalculator {

    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }

    //calculating LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //reading user input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // calling the method and storing the result
        int gcdValue = gcd(num1, num2);
        int lcmValue = lcm(num1, num2);

        // displaying the result
        System.out.println("GCD: " + gcdValue);
        System.out.println("LCM: " + lcmValue);

        input.close();
    }
}
