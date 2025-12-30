/* Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;
public class MovieTicketBookingApp{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

Boolean running=true;
int occupied=0;
int capacity=50;
String seatName = "";
String cinemaType = "";
String snackName = "";
String movieName = "";

//String seatPreference;
while(running){

System.out.println("----------------------------------");

System.out.println("Welcome to Cinepolis App");
System.out.println("Select Movie Type:");
System.out.println("case1. Animation");
System.out.println("case2. Action");
System.out.println("case3. Comedy");
System.out.println("case4. Horror");
System.out.println("case5. Romance");
System.out.println("case6. Select for exit");

System.out.println("----------------------------------");
String movieType = input.next();

System.out.println();
if (movieType.equals("6")) {
    System.out.println("Thank you for Visiting Cinepolis App");
    break; // exit loop immediately
}
System.out.println("***********************************");
System.out.println("Choose Seating Preference ");
System.out.println("CaseA:  Gold");
System.out.println("CaseB:  Silver");
System.out.println("***********************************");
String seatPreference = input.next();
if(seatPreference.equalsIgnoreCase("A")){
seatName = "Gold";

}
else if(seatPreference.equalsIgnoreCase("B")){
seatName = "Silver";
}

System.out.println();

System.out.println("+++++++++++++++++++++++++++++++++++++");
System.out.println("Select Snacks Type:");
System.out.println("1. Popcorn");
System.out.println("2. Munchies");
System.out.println("3. cold-drink");
System.out.println("4. Ice Cream");
System.out.println("5. Fast Food");
System.out.println("+++++++++++++++++++++++++++++++++++++");
String  snackPreference= input.next();
System.out.println();

switch (movieType){
case "1":
cinemaType = "Animation";
snackName = "Popcorn";
if(occupied<capacity){
occupied++;
System.out.println("You got confirm seat of " + cinemaType +
        " movie, seating preference is " + seatName +
        ", selected snack is " + snackName);
}
else {
System.out.println("Seat  is full");
}
break;


case "2":
cinemaType = "Action";
snackName = "Munchies";
if(occupied<capacity){
occupied++;
System.out.println("You got confirm seat of " + cinemaType +
        " movie, seating preference is " + seatName +
        ", selected snack is " + snackName);
}
else {
System.out.println("Seat  is full");
}
break;

case "3":
cinemaType = "Comedy";
snackName = "Cold Drink";
if(occupied<capacity){
occupied++;
System.out.println("You got confirm seat of " + cinemaType +
        " movie, seating preference is " + seatName +
        ", selected snack is " + snackName);
}
else {
System.out.println("Seat  is full");
}
break;

case "4":
cinemaType = "Horror";
snackName = "Ice Cream";
if(occupied < capacity){
occupied++;
System.out.println("You got confirm seat of " + cinemaType +
        " movie, seating preference is " + seatName +
        ", selected snack is " + snackName);
}
else {
System.out.println("Seat  is full");
}
break;

case "5":
cinemaType = "Romance";
snackName = "Fast Food";
if(occupied < capacity){
occupied++;
System.out.println("You got confirm seat of " + cinemaType +
        " movie, seating preference is " + seatName +
        ", selected snack is " + snackName);
}else {
System.out.println("Seat  is full");
}
break;

case "6":
System.out.println();
System.out.println("Thank you for Visiting Cinepolis App ");
running = false;
break;

default:
System.out.println("Invalid Choice Enter Again");
continue;

}
if( occupied == capacity){
System.out.println("The theatre is fully booked");
running =false;
}
}
input.close();
}
}

