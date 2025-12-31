import java.util.Scanner;
//creating a class with name as CurrencyExchangeKiosk

public class CurrencyExchangeKiosk{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

boolean running =true;
double convertedAmount;
int choice;
double amount;

do{
System.out.println("**********************************************"); System.out.println("Welcome to Currency Exchange Kiosk 💱");
System.out.println("Enter the Amount in INR ");
amount = input.nextDouble();
System.out.println();
System.out.println("-------------------------------------------");
System.out.println("Please choose target Country Currency ");
System.out.println("1:  United States(USD)");
System.out.println("2:  United Kingdom(GBP)");
System.out.println("3:  Japan(JPY)");
System.out.println("4:  China(CNY)");
System.out.println("5:  Russia(RUB)");
System.out.println("--------------------------------------------");
choice=input.nextInt();
System.out.println();

switch (choice){
case 1:
convertedAmount = amount*91.5;
System.out.println(" Converted amount in United States(USD) is: "+ convertedAmount);
System.out.println();
System.out.println("Thank YOU! ");
break;


case 2:
 convertedAmount = amount*121.2;
System.out.println("Converted amount in United Kingdom(GBP) is: "+ convertedAmount);
System.out.println();
System.out.println("Thank YOU!");
break;

case 3: 
 convertedAmount = amount*0.59;
System.out.println("Converted amount in Japan(JPY) is: "+ convertedAmount);
System.out.println();
System.out.println("Thank YOU!");
break;

case 4: 
 convertedAmount = amount*12.8;
System.out.println("Converted amount in  China(CNY) is: "+ convertedAmount);
System.out.println();
System.out.println("Thank YOU!");
break;

case 5: 
 convertedAmount = amount*1.15;
System.out.println("Converted amount in  Russia(RUB) is: "+ convertedAmount);
System.out.println();
System.out.println("Thank YOU!");
break;


default:
System.out.println("Please select valid country currency");
continue;
}
System.out.println("Do you want another country conversion ?");
System.out.println("1. Yes");
System.out.println("2. No");
choice = input.nextInt();

} while (choice == 1);
System.out.println("**********************************************");
System.out.println();
System.out.println("Thank you for using Currency Exchange Kiosk 💱. Visit Again! ");

}
}


