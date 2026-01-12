package smart_parking_management_system;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private Vehicle parkedVehicle;

    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied && vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            this.parkedVehicle = vehicle;
            this.isOccupied = true;
            return true;
        }
        return false;
    }

    public double releaseVehicle(int hours) {
        if (parkedVehicle == null) return 0;

        double charges = parkedVehicle.calculateCharges(hours);
        parkedVehicle = null;
        isOccupied = false;
        return charges;
    }

    public String getSlotId() {
        return slotId;
    }
}

