import java.util.Scanner;
//Creating a class with name as MultiplicationTable
public class MultiplicationTable{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter  a number ");
int  number =input.nextInt();
int  result[] =new int [4] ;
int index =0;
for( int i=6; i <=9; i++){
result[index]=number * i ;
index++;
}
int counter =0;
for( int i=6; i <=9; i++){
System.out.println(number + " * i " +i + " = " + result[counter] );
counter++;
}
input.close();
}
}
