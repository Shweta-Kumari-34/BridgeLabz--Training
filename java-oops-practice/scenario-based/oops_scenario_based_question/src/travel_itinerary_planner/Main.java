package travel_itinerary_planner;

public class Main {

    public static void main(String[] args) {

        Transport flight = new Transport(25000);
        Hotel hotel = new Hotel(18000);
        Activity safari = new Activity(7000);

        Trip trip1 = new InternationalTrip(
                "Paris", 7, flight, hotel, safari
        );

        trip1.book();
        System.out.println("Total Budget: ₹" + trip1.getTotalBudget());

        System.out.println();

        Trip trip2 = new DomesticTrip(
                "Goa", 5,
                new Transport(5000),
                new Hotel(8000),
                new Activity(3000)
        );

        trip2.book();
        System.out.println("Total Budget: ₹" + trip2.getTotalBudget());
    }
}
