import java.util.Scanner;
//Creating a class with name as FactorOfNumber
public class FactorOfNumber{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter  a number ");
int number =input.nextInt();
int  maxfactor = 10 ;
int [] factors = new int [maxfactor];
int index =0;
for ( int i=1 ; i<=number ; i++){
if( number % i ==0 ){
if( index == maxfactor){
//if number of factor exceeds then double the maxFactor to store more factor
maxfactor = maxfactor *2 ;
int [] temp =new int [maxfactor];
for ( int j=0; j < factors.length ; j++){
temp[j] = factors[j];
}
// copying the factors into factor array
factors = temp;
}
factors [index]= i;
index ++;
}
}

//displaying result
System.out.println("factor of the number " + number + "are are ");
for ( int i=0;i< index ; i++){
System.out.print( factors[i] + " ");
}
input.close ();
}
}