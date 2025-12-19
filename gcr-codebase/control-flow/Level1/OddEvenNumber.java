import java.util.Scanner;
//Creating a class with name as OddEvenNumber
public class OddEvenNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
int factorial=1;
System.out.println("Enter a natural number ");
number=input.nextInt();

//check for natural number 
if(number <=0){
System.out.println("Pleas enter a natural number ");
}
//for loop run from 1 to number
else{
for( int count =1; count <=number; count++){
//check number is even or odd and display result
if( count %2 == 0){
System.out.println(count+"is Even ");
}
else {
System.out.println(count+"is odd ");
}
}
}

input.close();
}
}
