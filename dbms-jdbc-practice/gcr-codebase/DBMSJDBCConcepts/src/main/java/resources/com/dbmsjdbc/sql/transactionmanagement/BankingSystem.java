package resources.com.dbmsjdbc.sql.transactionmanagement;

import java.sql.*;
import java.util.Scanner;

public class BankingSystem {

    static final String URL = "jdbc:mysql://localhost:3306/practice_db";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            while (true) {
                System.out.println("\n===== Banking System =====");
                System.out.println("1. Transfer Money");
                System.out.println("2. Check Balance");
                System.out.println("3. Transaction History");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        transferMoney(con, sc);
                        break;

                    case 2:
                        checkBalance(con, sc);
                        break;

                    case 3:
                        transactionHistory(con, sc);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //  Transfer Money (Transaction Management)
    public static void transferMoney(Connection con, Scanner sc) {

        try {
            System.out.print("Enter From Account ID: ");
            int fromId = sc.nextInt();

            System.out.print("Enter To Account ID: ");
            int toId = sc.nextInt();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            con.setAutoCommit(false);  //  START TRANSACTION

            // Check balance
            String checkSql = "SELECT balance FROM account WHERE account_id = ?";
            try (PreparedStatement checkStmt = con.prepareStatement(checkSql)) {
                checkStmt.setInt(1, fromId);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    double balance = rs.getDouble("balance");

                    if (balance < amount) {
                        System.out.println("Insufficient balance!");
                        con.rollback();
                        return;
                    }
                } else {
                    System.out.println("From account not found!");
                    con.rollback();
                    return;
                }
            }

            // Deduct from sender
            String deductSql = "UPDATE account SET balance = balance - ? WHERE account_id = ?";
            try (PreparedStatement deductStmt = con.prepareStatement(deductSql)) {
                deductStmt.setDouble(1, amount);
                deductStmt.setInt(2, fromId);
                deductStmt.executeUpdate();
            }

            // Add to receiver
            String addSql = "UPDATE account SET balance = balance + ? WHERE account_id = ?";
            try (PreparedStatement addStmt = con.prepareStatement(addSql)) {
                addStmt.setDouble(1, amount);
                addStmt.setInt(2, toId);
                addStmt.executeUpdate();
            }

            // Insert transaction record
            String insertSql = "INSERT INTO transactions_history (from_account, to_account, amount) VALUES (?, ?, ?)";
            try (PreparedStatement insertStmt = con.prepareStatement(insertSql)) {
                insertStmt.setInt(1, fromId);
                insertStmt.setInt(2, toId);
                insertStmt.setDouble(3, amount);
                insertStmt.executeUpdate();
            }

            con.commit();   //  COMMIT
            System.out.println("Transfer successful!");

        } catch (Exception e) {
            try {
                con.rollback();  //  ROLLBACK if error
                System.out.println("Transaction failed! Rolled back.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                con.setAutoCommit(true); // Reset
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //  Check Balance
    public static void checkBalance(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        String sql = "SELECT balance FROM account WHERE account_id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next())
                System.out.println("Balance: ₹" + rs.getDouble("balance"));
            else
                System.out.println("Account not found!");
        }
    }

    //  Transaction History
    public static void transactionHistory(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        String sql = "SELECT * FROM transaction_history WHERE from_account = ? OR to_account = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setInt(2, id);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Transaction History ---");

            while (rs.next()) {
                System.out.println(
                        "TxnID: " + rs.getInt("transaction_id") +
                        " | From: " + rs.getInt("from_account") +
                        " | To: " + rs.getInt("to_account") +
                        " | Amount: ₹" + rs.getDouble("amount") +
                        " | Date: " + rs.getTimestamp("transaction_date")
                );
            }
        }
    }
}

