package travel_itinerary_planner;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + destination);
        System.out.println("Visa & passport verification completed");
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with refund policy applied");
    }
}
