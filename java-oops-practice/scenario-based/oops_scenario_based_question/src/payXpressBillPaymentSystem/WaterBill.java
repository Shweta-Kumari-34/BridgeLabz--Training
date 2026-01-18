package payXpressBillPaymentSystem;
public class WaterBill extends Bill {

    public WaterBill(double amount) {
        super("Water", amount);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid successfully");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Please pay your water bill before " + getDueDate());
    }
}

