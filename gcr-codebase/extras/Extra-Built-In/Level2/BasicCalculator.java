import java.util.Scanner;
//creating a class with name as BasicCalculator
public class BasicCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero not allowed.");
            return -1;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //reading input from user
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.println("\nChoose Operation: ");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result = " + add(n1, n2));
            case 2: System.out.println("Result = " + subtract(n1, n2));
            case 3: System.out.println("Result = " + multiply(n1, n2));
            case 4: System.out.println("Result = " + divide(n1, n2));
            default: System.out.println("Invalid Option!");
        }

        sc.close();
    }
}
