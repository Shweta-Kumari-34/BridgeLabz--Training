package travellogapp;
import java.io.Serializable;

//trip data class
public class Trip implements Serializable {

 String city;
 String country;
 int days;

 public Trip(String city, String country, int days) {
     this.city = city;
     this.country = country;
     this.days = days;
 }
}

