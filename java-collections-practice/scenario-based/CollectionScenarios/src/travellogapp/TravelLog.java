package travellogapp;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLog {

    // write trips to file
    public static void writeTrips(List<Trip> trips) throws Exception {
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("trips.dat"));
        out.writeObject(trips);
        out.close();
    }

    // read trips from file
    public static List<Trip> readTrips() throws Exception {
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("trips.dat"));
        List<Trip> trips = (List<Trip>) in.readObject();
        in.close();
        return trips;
    }

    // cities using regex
    public static void findCities(List<Trip> trips) {
        Pattern pattern = Pattern.compile("[A-Za-z]+");

        for (Trip t : trips) {
            Matcher matcher = pattern.matcher(t.city);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }

    // trips more than 5 days
    public static void longTrips(List<Trip> trips) {
        for (Trip t : trips) {
            if (t.days > 5) {
                System.out.println(t.city + " - " + t.days + " days");
            }
        }
    }

    // unique countries
    public static void uniqueCountries(List<Trip> trips) {
        Set<String> set = new HashSet<>();
        for (Trip t : trips) {
            set.add(t.country);
        }
        System.out.println(set);
    }

    // top 3 visited cities
    public static void topCities(List<Trip> trips) {
        Map<String, Integer> map = new HashMap<>();

        for (Trip t : trips) {
            map.put(t.city, map.getOrDefault(t.city, 0) + 1);
        }

        map.entrySet().stream()
           .sorted((a, b) -> b.getValue() - a.getValue())
           .limit(3)
           .forEach(e -> System.out.println(e.getKey()));
    }
}

