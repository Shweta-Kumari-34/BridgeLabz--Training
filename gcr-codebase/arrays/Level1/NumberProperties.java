import java.util.Scanner;
//Creating a class with name as NumberProperties
public class NumberProperties{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int[] elements = new int[5];

//reading user input
System.out.println("Enter the five number");
for (int i = 0; i < 5 ; i++) {
elements[i] = input.nextInt();
}

//check number properties and displaying result accordingly
for(int i=0;i<5;i++){
if( elements[i] > 0){
if( elements[i] % 2 == 0){
System.out.println( elements[i] + " Number is even");
}
else {
System.out.println( elements[i] + " Number is odd");
}
}
else if( elements[i]<0){
System.out.println( elements[i] + " Number is negative ");
}
else if( elements[i]==0){
System.out.println( elements[i] + " Number is zero ");
}
}
if( elements[0]==elements[4]){
System.out.println( "Equal");
}
else if( elements[0]>elements[4]){
System.out.println( "Greater");
}
else {
System.out.println( "Less");
}
input.close();
}
}







