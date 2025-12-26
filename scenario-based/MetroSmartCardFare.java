import java.util.Scanner;
//creating a class with name as MetroSmartCardFare
public class MetroSmartCardFare {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading input from user
double balance;
System.out.print("Enter initial smart card balance: ");
balance = input.nextDouble();

while (balance > 0) {
System.out.print("Enter distance km or -1 to exit: ");
int distance = input.nextInt();

if (distance == -1) {
System.out.println("Journey stopped.");
break;
}

// Fare below 5 km -> 10rs else 20rs (example)
double fare = (distance < 5) ? 10 : 20;

//checking conditions and displaying the result
if (balance >= fare) {
balance -= fare;
System.out.println("Fare deducted: Rs " + fare);
System.out.println("Remaining Balance: Rs " + balance);
} else {
System.out.println("Insufficient balance! Recharge needed.");
break;
}
}
System.out.println("Card usage finished.");

input.close();
}
}
