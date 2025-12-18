//Creating a class with name as UniversityFeeDiscount 
public class UniversityFeeDiscount{
public static void main(String[]args){

//Declaring the Variables and calculating discount amount and final fee
double fee=125000;
double discountPercent = 10;
double discount=(fee *discountPercent ) /100;
double finalFee=fee-discount;

//displaying the result
System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
}
}
