import java.util.Scanner;
//Creating a class with name as FizzBuzzArray
public class FizzBuzzArray{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input
System.out.println("Enter a positive number ");
int number = input.nextInt();

String[] result =new String [number +1];
//check for positive number
if(number<=0){
System.out.println(" Pease enter a positive number ");
}
// for loop from 1 to number and check multiples condition
else {
for ( int i=0; i<=number; i++){
if ( i%3==0 && i% 5 == 0){
result [i] = "FizzBuzz";
}
else if ( i%3==0){
result [i] = "Fizz";
}
}
else if ( i%5==0){
result [i] = "Buzz";
}
else{
result[i] = String. valueOf(i);
System.out.println(i);
}
}
for( int i=0; i<=number; i++){
System.out.println("POsition " + i + " = " +result[i]);
}
input .close();
}
}


