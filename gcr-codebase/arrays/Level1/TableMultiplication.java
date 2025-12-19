import java.util.Scanner;
//Creating a class with name as TableMultiplication
public class TableMultiplication{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int[] table = new int[10];

//Readig the number from user and calculating the multiplication 
System.out.println("Enter the number");
int number = input.nextInt();
for (int i = 0 ; i < 10 ; i++) {
table[i] = number * (i + 1) ;
}

// displaying table
for (int i = 0; i < 10 ; i++) {
System.out.println(number  +" * " +(i + 1)+ " =  " + table[i] );
}
input.close();
}
}

