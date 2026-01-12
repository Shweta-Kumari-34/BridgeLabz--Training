package smart_parking_management_system;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<ParkingSlot> slots = new ArrayList<>(); // internal records

    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    public void bookSlot(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable() && slot.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked in slot: " + slot.getSlotId());
                return;
            }
        }
        System.out.println("No slot available for this vehicle type");
    }

    public void releaseSlot(String slotId, int hours) {
        for (ParkingSlot slot : slots) {
            if (slot.getSlotId().equals(slotId)) {
                double amount = slot.releaseVehicle(hours);
                System.out.println("Parking Charges: ₹" + amount);
                return;
            }
        }
    }
}
