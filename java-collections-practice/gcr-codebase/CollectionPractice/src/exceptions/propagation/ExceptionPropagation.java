package exceptions.propagation;

public class ExceptionPropagation {
	 // Method where exception occurs
    public static void method1() {
        int result = 10 / 0;   // ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        method1();
    }

    // main method handles the exception
    public static void main(String[] args) {

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
