package deliveryChainManagement;

public class ParcelTracker {

    private Stage head;

    // Default delivery chain
    ParcelTracker() {
        head = new Stage("Packed");
        head.next = new Stage("Shipped");
        head.next.next = new Stage("In Transit");
        head.next.next.next = new Stage("Delivered");
    }

    // Forward tracking
    void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost: no tracking data available");
            return;
        }

        Stage temp = head;
        System.out.print("Tracking Status: ");
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add custom checkpoint after a given stage
    void addCheckpoint(String afterStage, String newStage) {
        Stage temp = head;

        while (temp != null && !temp.name.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Cannot add checkpoint");
            return;
        }

        Stage checkpoint = new Stage(newStage);
        checkpoint.next = temp.next;
        temp.next = checkpoint;

        System.out.println("Checkpoint added: " + newStage);
    }

    // Handle lost or missing parcel
    void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as lost");
    }
}

