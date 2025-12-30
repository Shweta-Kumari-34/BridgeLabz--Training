import java.util.Scanner;
public class TrainReservation{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

Boolean running=true;

int totalSeatInSlipper = 24;
int totalSeatInAC3Tier = 16;
int totalSeatInAC2Tier = 12;
int totalSeatInAC1Tier = 8;
int totalSeatInChairCar = 24;

int occupiedSeatInSlipper=0;
int occupiedSeatInAC3Tier=0;
int occupiedSeatInAC2Tier=0;
int occupiedSeatInAC1Tier=0;
int occupiedSeatInChairCar=0;

//String seatPreference;
while(running){
System.out.println("----------------------------------");
System.out.println("Welcome to Indian Railways");
System.out.println("Select Coach:");
System.out.println("1. Sleeper");
System.out.println("2. AC 3 Tier");
System.out.println("3. AC 2 Tier");
System.out.println("4. AC First Class");
System.out.println("5. Chair Car");
System.out.println("6. Select for exit");


System.out.println("----------------------------------");
int coach = input.nextInt();
String seatPreference;

switch (coach){
case 1:
if(occupiedSeatInSlipper < totalSeatInSlipper){
System.out.println("Select  the seat preference ");
System.out.println("CaseA:  Lower");
System.out.println("CaseB:  Middle");
System.out.println("caseC:  Upper");
System.out.println("caseD: Side Lower");
System.out.println("caseE: Side Upper");
seatPreference=input.next();
System.out.println();
System.out.println("*****Seat is allotted. Thank You!*****");
occupiedSeatInSlipper++;
}
else{
System.out.println("Seat is already full. Visit Again!");
}break;

case 2:
if(occupiedSeatInAC3Tier < totalSeatInAC3Tier){
System.out.println("Select  the seat preference ");
System.out.println("CaseA:  Lower");
System.out.println("CaseB:  Middle");
System.out.println("caseC:  Upper");
System.out.println("caseD: Side Lower");
System.out.println("caseE: Side Upper");
seatPreference=input.next();
System.out.println();
System.out.println("*****Seat is allotted. Thank You!*****");
occupiedSeatInAC3Tier++;

}
else{
System.out.println("Seat is already full. Visit Again!");
}break;

case 3: 
if( occupiedSeatInAC2Tier < totalSeatInAC2Tier){
System.out.println("Select  the seat preference ");
System.out.println("CaseA:  Lower");
System.out.println("caseC:  Upper");
System.out.println("caseD: Side Lower");
System.out.println("caseE: Side Upper");
seatPreference=input.next();
System.out.println();
System.out.println("*****Seat is allotted. Thank You!*****");
occupiedSeatInAC2Tier++;

}
else{
System.out.println("Seat is already full. Visit Again!");
}break;

case 4:
if( occupiedSeatInAC1Tier < totalSeatInAC1Tier){
System.out.println("Select  the seat preference ");
System.out.println("Select  the seat preference ");
System.out.println("CaseA:  Coupe");
System.out.println("caseC:  Cabin");
seatPreference=input.next();
System.out.println();
System.out.println("*****Seat is allotted. Thank You!*****");
occupiedSeatInAC1Tier++;

}
else{
System.out.println("Seat is already full. Visit Again!");
}break;

case 5:
if( occupiedSeatInChairCar < totalSeatInChairCar){
System.out.println("Select  the seat preference ");
System.out.println("CaseA:  Window");
System.out.println("caseC:  Middle");
System.out.println("caseC:  Side");
seatPreference=input.next();
System.out.println();
System.out.println("*****Seat is allotted. Thank You!*****");
occupiedSeatInChairCar++;

}
else{
System.out.println("Seat is already full. Visit Again!");
}break;

case 6:
System.out.println();
System.out.println("Thank you for using Indian Railways");
running = false;
break;


default:
System.out.println("Invalid Choice Enter Again");
continue;
}
}
input.close();
}
}

