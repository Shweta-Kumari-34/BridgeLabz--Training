import java.util.Scanner;
//Creating a class with name as ArraySum
public class ArraySum{
public static void main(String[]args){
Scanner input = new Scanner(System.in);


double [] numbers=new double [10] ;
double total = 0.0;
int index =0;

//while loop run until user enters 0 or negative or index == 0
while( true ){
System.out.println("Enter  a number ");
double value =input.nextDouble();
if (value <=0){
break;
}
if (index == 10){
break;
}
numbers [index ] = value;
index++;
}
System.out.println("Enter   number  is ");
for( int i=0; i < index; i++){
System.out.println(numbers[i]);
total+=numbers[i];
}

//displaying result
System.out.println("Total value is " +total);
input.close();
}
} 
