package questions.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Add some accounts
        bank.addAccount("ACC1001", 5000);
        bank.addAccount("ACC1002", 3000);
        bank.addAccount("ACC1003", 7000);

        // Display accounts
        bank.displayAccounts();
        System.out.println();

        // Queue some withdrawals
        bank.requestWithdrawal("ACC1001", 1000);
        bank.requestWithdrawal("ACC1002", 4000); // Insufficient
        bank.requestWithdrawal("ACC1003", 2000);

        // Process withdrawals
        System.out.println("Processing withdrawals...");
        bank.processWithdrawals();
        System.out.println();

        // Display updated accounts
        bank.displayAccounts();
        System.out.println();

        // Display accounts sorted by balance
        bank.displayAccountsByBalance();
    }
}

