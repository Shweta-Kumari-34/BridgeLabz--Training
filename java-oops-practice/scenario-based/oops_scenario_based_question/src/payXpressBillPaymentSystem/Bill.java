package payXpressBillPaymentSystem;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    private String type;
    private double amount;
    private LocalDate dueDate;
    private boolean isPaid;

    protected Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Recurring bill constructor
    protected Bill(String type, double amount) {
        this(type, amount, LocalDate.now().plusMonths(1));
    }

    public double calculateLateFee(double penalty) {
        return amount + penalty;   // operator usage
    }

    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected String getType() {
        return type;
    }

    protected LocalDate getDueDate() {
        return dueDate;
    }
}

