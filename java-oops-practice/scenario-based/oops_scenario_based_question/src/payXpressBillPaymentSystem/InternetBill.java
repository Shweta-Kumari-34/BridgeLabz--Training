package payXpressBillPaymentSystem;

public class InternetBill extends Bill {

    public InternetBill(double amount) {
        super("Internet", amount);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Internet bill paid. Connection remains active");
    }

    @Override
    public void sendReminder() {
        System.out.println("Urgent: Internet bill due on " + getDueDate());
    }
}

