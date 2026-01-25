package junit.testingbankingtransactions;

public class BankAccount {

	private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    // deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // withdraw money from the account
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        if (amount > 0) {
            balance -= amount;
        }
    }
    // get current balance
    public double getBalance() {
        return balance;
    }
}
