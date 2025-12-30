import java.util.Scanner;
public class ParkingLot{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int capacity =30;
int occupied=0;
boolean running =true;

while(running){
System.out.println("-------------------------------------------");
System.out.println(" Available Options In Parking Lot Are");
System.out.println("Case1:  Park");
System.out.println("Case2:  Exit");
System.out.println("case3:  show Occupied space");
System.out.println("--------------------------------------------");
int choice=input.nextInt();

switch (choice){
case 1:
if(occupied<capacity){
occupied++;
System.out.println("Vehicle is park at slot "+ occupied);
}else {
System.out.println("Parking Lot is full");
}
break;


case 2:
if(occupied>0){
System.out.println("Vehicle is Exited. ThankYou!  ");
occupied--;
}else {
System.out.println("No vehicle is parked right now");
}
break;

case 3: 
System.out.println("Occupied space is: " +occupied);
System.out.println("Remaining space is: " +(capacity-occupied));
break;



default:
System.out.println("Invalid Choice Enter Again");
continue;
}
if( occupied == capacity){
System.out.println("The parking lot is already full");
running =false;
}
}

}
}


