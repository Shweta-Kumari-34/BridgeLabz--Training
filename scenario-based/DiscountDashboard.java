import java.util.Scanner;
//creating a class with name as DiscountDashboard
//shopkeeper gives discounts based on total bill
public class DiscountDashboard{

public static void main(String[] args){
Scanner input=new Scanner (System.in);

System.out.println("Enter the number of  item");
int totalItem =input.nextInt();
int []itemPrice =new int[totalItem];
double totalPrice =0;
double discount=0.0;
double bill;

for( int i=0;i< totalItem;i++){
System.out.println("Enter the price of item "+(i+1));
itemPrice[i]=input.nextInt();
totalPrice+= itemPrice[i];
}

if( totalPrice >=1000 && totalPrice<=2000){
discount = totalPrice*0.05;
bill = totalPrice-discount;
}
else if(totalPrice >=2000 && totalPrice<=3000){
 discount = totalPrice*0.1;
bill = totalPrice-discount;
}
else{
discount = totalPrice*0.2;
bill = totalPrice-discount;
}

System.out.println("Total bill is "+bill+" after discount of "+discount);
input.close();
}
}
