package exceptions.banktransactionsystem;

import java.util.Scanner;

public class BankTransaction {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            input.close();
        }
    }
}
