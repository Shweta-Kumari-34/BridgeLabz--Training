package deliveryChainManagement;

public class Main {
	public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.trackParcel();

        tracker.addCheckpoint("Shipped", "Customs Check");
        tracker.trackParcel();

        tracker.markParcelLost();
        tracker.trackParcel();
    }
}
