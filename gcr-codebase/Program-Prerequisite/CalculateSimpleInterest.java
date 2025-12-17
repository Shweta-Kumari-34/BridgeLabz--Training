import java.util.Scanner;
public class CalculateSimpleInterest{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

double Principal, Rate, Time, Result;
System.out.println("Enter the Principal Amount");
Principal=input.nextDouble();
System.out.println("Enter the Rate");
Rate=input.nextDouble();
System.out.println("Enter the Time");
Time=input.nextDouble();
Result=((Principal*Rate*Time)/100);
System.out.println("The resultant Simple Interest is "+Result);
}
}