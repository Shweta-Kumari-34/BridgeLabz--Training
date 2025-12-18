//Creating a class with name as CalculateProfitLoss
public class CalculateProfitLoss{
public static void main(String[]args){

//Declaring the Variables and calculating profitPercentage
int costPrice=129;
int sellingPrice=191;
int profit=sellingPrice-costPrice;
double profitPercentage=(profit*100.0)/costPrice;

//displaying the result
System.out.println("The Cost Price is INR "+costPrice +"\nSelling Price is INR "+sellingPrice + "\nProfit is INR "+profit+ "\nProfit Percentage = "+profitPercentage +"%" );
}
}
