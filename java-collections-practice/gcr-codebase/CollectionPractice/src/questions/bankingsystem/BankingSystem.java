package questions.bankingsystem;

import java.util.*;

public class BankingSystem {

	Map<String, Double> accounts = new HashMap<>();
	Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

	// Add a new account
	public void addAccount(String accountNumber, double balance) {
		accounts.put(accountNumber, balance);
	}

	// Deposit money
	public void deposit(String accountNumber, double amount) {
		if (accounts.containsKey(accountNumber)) {
			accounts.put(accountNumber, accounts.get(accountNumber) + amount);
			System.out.println("Deposited $" + amount + " to " + accountNumber);
		} else {
			System.out.println("Account not found: " + accountNumber);
		}
	}

	// Queue a withdrawal request
	public void requestWithdrawal(String accountNumber, double amount) {
		withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
	}

	// Process all withdrawal requests
	public void processWithdrawals() {
		while (!withdrawalQueue.isEmpty()) {
			WithdrawalRequest req = withdrawalQueue.poll();
			String acc = req.accountNumber;
			double amt = req.amount;
			if (!accounts.containsKey(acc)) {
				System.out.println("Account not found: " + acc);
			} else if (accounts.get(acc) < amt) {
				System.out.println("Insufficient balance in account " + acc);
			} else {
				accounts.put(acc, accounts.get(acc) - amt);
				System.out.println("Withdrawal of $" + amt + " from " + acc + " processed.");
			}
		}
	}

	// Display accounts in HashMap unordered
	public void displayAccounts() {
		System.out.println("All Accounts (unordered):");
		for (Map.Entry<String, Double> entry : accounts.entrySet()) {
			System.out.println(entry.getKey() + ": $" + entry.getValue());
		}
	}

	// Display accounts sorted by balance using TreeMap
	public void displayAccountsByBalance() {
		// TreeMap naturally sorts by key,as we need sorted by value
		TreeMap<Double, List<String>> sortedMap = new TreeMap<>();
		for (Map.Entry<String, Double> entry : accounts.entrySet()) {
			double balance = entry.getValue();
			sortedMap.putIfAbsent(balance, new ArrayList<>());
			sortedMap.get(balance).add(entry.getKey());
		}

		System.out.println("Accounts sorted by balance:");
		for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
			for (String acc : entry.getValue()) {
				System.out.println(acc + ": $" + entry.getKey());
			}
		}
	}

	// Inner class for withdrawal requests
	static class WithdrawalRequest {
		String accountNumber;
		double amount;

		WithdrawalRequest(String accountNumber, double amount) {
			this.accountNumber = accountNumber;
			this.amount = amount;
		}
	}
}
