package payXpressBillPaymentSystem;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount) {
        super("Electricity", amount);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Electricity bill paid successfully");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Electricity bill due on " + getDueDate());
    }
}

