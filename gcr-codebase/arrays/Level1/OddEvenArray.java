import java.util.Scanner;
//Creating a class with name as OddEvenArray
public class OddEvenArray{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter  a number ");
int number =input.nextInt();
if ( number <=0 ){
System.out.println("Error : not a natural number");
 return ;
}

//creating even and odd array
int [] even = new int [(number/2)+1] ;
int [] odd = new int [(number/2)+1] ;
int evenIndex = 0;
int oddIndex = 0;
//strong number into respective array
for( int i=1; i <=number; i++){
if( i % 2 ==0){
even[evenIndex]= i ;
evenIndex++;
}else {
odd[oddIndex]= i ;
oddIndex++;
}
}

//displaying result
System.out.println("odd  number  is ");
for( int i=0; i < oddIndex; i++){
System.out.println(odd[i] + " ");
}
System.out.println("even number  is ");
for( int i=0; i < evenIndex; i++){
System.out.println(even[i] + " ");
}
input.close();
}
}
