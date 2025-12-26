import java.util.Scanner;
//creating a class with name as CoffeeCounterChronicles
public class CoffeeCounterChronicles {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String coffeeType;
final double GST_PERCENT = 0.18; // 18% GST
boolean running = true;

System.out.println("Welcome to Ravi's Café!");

while (running) {
System.out.print("Enter coffee type (Espresso, Latte, Cappuccino, Mocha) or type 'exit' to stop: ");
coffeeType = input.nextLine().trim();

if (coffeeType.equalsIgnoreCase("exit")) {
running = false;
System.out.println("Thank you for visiting Ravi's Cafe");
break;
}

System.out.print("Enter quantity: ");
int quantity = input.nextInt();

double price = 0;

switch (coffeeType.toLowerCase()) {
case "espresso":
price = 120;
break;
case "latte":
price = 150;
case "cappuccino":
price = 130;
break;
case "mocha":
price = 160;
break;
default:
System.out.println("Invalid coffee type. Please try again.");
continue; // skip to the next iteration of while loop
}
double total = price * quantity;
double gstAmount = total * GST_PERCENT;
double finalBill = total + gstAmount;

//displaying the result
System.out.println("Total Bill (including GST 18%) is: " + finalBill);

}

input.close();
}
}
