package com.constructors.level1;

public class HotelBooking {
String guestName;
String roomType;
int nights;

HotelBooking()
{
	guestName = "Tom";
	roomType = "Single";
	nights= 3;

	}

HotelBooking( String guestName, String roomType, int nights){
	this.guestName= guestName;
	this.roomType=roomType;
	this.nights=nights;
}
HotelBooking(HotelBooking copy){
	this.guestName=copy.guestName;
	this.roomType=copy.roomType;
	this.nights=copy.nights;
}
void displayBookingDetails() {
	System.out.println("guestName:" +guestName);
	System.out.println("roomType:" +roomType);
	System.out.println("nights:" +nights);
}
public static void main(String[] args) {
	HotelBooking Booking1= new HotelBooking();
	HotelBooking Booking2 =new HotelBooking("Harry", "Triple", 5);
	HotelBooking Booking3=new HotelBooking(Booking2);
	Booking1.displayBookingDetails();
	System.out.println();
	Booking2.displayBookingDetails();
	System.out.println();
	Booking3.displayBookingDetails();
	}

}
