import java.util.Scanner;
//Creating a class with name as ChocolateDivision
public class ChocolateDivision{
//Creating a method with chocolateDistribution
public static int[] chocolateDistribution(int number, int divisor) {
int chocolatesEach = number / divisor; 
int remainingChocolates = number % divisor ;
return new int[]{chocolatesEach, remainingChocolates};
}
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter the total number of chocolates " );
int numberOfchocolates = input.nextInt();
System.out.println("Enter the  total number of children ");
int numberOfChildren = input.nextInt();
int [] result = chocolateDistribution(numberOfchocolates, numberOfChildren);

//displaying the result
System.out.println("Each child will get " + result[0] + " chocolates");
System.out.println("Remaining chocolates = " + result [1]);
input.close();
}
}