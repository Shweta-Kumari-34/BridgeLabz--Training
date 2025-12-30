import java.util.Scanner;
//creating a class with name as RechargeSimulator
//Phone Recharge Simulator program
public class RechargeSimulator{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

boolean running =true;
int balance=0;
int choice;

do{
System.out.println("-------------------------------------------");
System.out.println(" Welcome to Phone Recharge Simulator ");
System.out.println(" Choose Mobile Operator ");

System.out.println("Case1: Jio");
System.out.println("Case2:  BSNL");
System.out.println("case3:  VI");
System.out.println("case3:  Airtel");
System.out.println("--------------------------------------------");
 choice=input.nextInt();
System.out.println("Enter the reacharging amount ");
int amount =input.nextInt();
 balance+=amount;

switch (choice){
case 1:
System.out.println("Jio Offer: Extra 1GB/day for 5 days");
System.out.println("Recharge Is Done Successfully! ");
break;


case 2:
System.out.println("BSNL Offer: 1GB data for 2 days");
System.out.println("Recharge Is Done Successfully! ");
break;

case 3: 
System.out.println("VI Offer: 2GB bonus data");
System.out.println("Recharge Is Done Successfully! ");
break;

case 4: 
System.out.println("Airtel Offer: Unlimited calls for 7 days");
System.out.println("Recharge Is Done Successfully! ");
break;

default:
System.out.println("Invalid Operator selected");
continue;
}
System.out.println("Current Balance In Phone IS: " + balance);
System.out.println("Do you want to recharge again?");
System.out.println("1. Yes");
System.out.println("2. No");
choice = input.nextInt();

} while (choice == 1);

System.out.println("Thank you for using Phone Recharge Simulator. Visit Again! ");

}
}


