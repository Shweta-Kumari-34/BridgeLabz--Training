package travellogapp;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip("Paris", "France", 7));
        trips.add(new Trip("Berlin", "Germany", 4));
        trips.add(new Trip("Paris", "France", 6));
        trips.add(new Trip("Rome", "Italy", 8));

        // write and read trips
        TravelLog.writeTrips(trips);
        List<Trip> data = TravelLog.readTrips();

        System.out.println("cities:");
        TravelLog.findCities(data);

        System.out.println("trips > 5 days:");
        TravelLog.longTrips(data);

        System.out.println("unique countries:");
        TravelLog.uniqueCountries(data);

        System.out.println("top cities:");
        TravelLog.topCities(data);
    }
}

