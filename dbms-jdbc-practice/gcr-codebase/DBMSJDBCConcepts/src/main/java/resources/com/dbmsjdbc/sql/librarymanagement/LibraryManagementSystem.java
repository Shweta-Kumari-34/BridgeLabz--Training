package resources.com.dbmsjdbc.sql.librarymanagement;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryManagementSystem {

    static final String URL = "jdbc:mysql://localhost:3306/practice_db";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            while (true) {
                System.out.println("\n===== Library Management System =====");
                System.out.println("1. Add Book");
                System.out.println("2. Borrow Book");
                System.out.println("3. Return Book");
                System.out.println("4. Search Books");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        addBook(con, sc);
                        break;

                    case 2:
                        borrowBook(con, sc);
                        break;

                    case 3:
                        returnBook(con, sc);
                        break;

                    case 4:
                        searchBooks(con, sc);
                        break;

                    case 5:
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Add Book
    public static void addBook(Connection con, Scanner sc) throws SQLException {

        String sql = "INSERT INTO book (book_id, title, author, genre,  copies_available) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Genre: ");
            String category = sc.nextLine();

            System.out.print("Total Copies: ");
            int copies = sc.nextInt();
            sc.nextLine();

            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, category);
            ps.setInt(4, copies);
            ps.setInt(5, copies);

            ps.executeUpdate();
            System.out.println("Book added successfully!");
        }
    }

    //  Borrow Book (Transaction)
    public static void borrowBook(Connection con, Scanner sc) throws SQLException {

        System.out.print("Student ID: ");
        int studentId = sc.nextInt();

        System.out.print("Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        con.setAutoCommit(false);

        try {

            String checkSql = "SELECT copies_available FROM book WHERE book_id = ?";
            try (PreparedStatement checkStmt = con.prepareStatement(checkSql)) {
                checkStmt.setInt(1, bookId);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    int available = rs.getInt("copies_available");
                    if (available <= 0) {
                        System.out.println("No copies available!");
                        con.rollback();
                        return;
                    }
                }
            }

            String updateSql = "UPDATE books SET copies_available = copies_available - 1 WHERE book_id = ?";
            try (PreparedStatement ps = con.prepareStatement(updateSql)) {
                ps.setInt(1, bookId);
                ps.executeUpdate();
            }

            String insertSql = "INSERT INTO borrow_record (student_id, book_id, borrow_date) VALUES (?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(insertSql)) {
                ps.setInt(1, studentId);
                ps.setInt(2, bookId);
                ps.setDate(3, Date.valueOf(LocalDate.now()));
                ps.executeUpdate();
            }

            con.commit();
            System.out.println("Book borrowed successfully!");

        } catch (Exception e) {
            con.rollback();
            System.out.println("Transaction failed!");
        } finally {
            con.setAutoCommit(true);
        }
    }

    //  Return Book + Fine Calculation
    public static void returnBook(Connection con, Scanner sc) throws SQLException {

        System.out.print("Record ID: ");
        int recordId = sc.nextInt();
        sc.nextLine();

        String fetchSql = "SELECT borrow_date, book_id FROM borrow_records WHERE record_id = ?";

        try (PreparedStatement ps = con.prepareStatement(fetchSql)) {

            ps.setInt(1, recordId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                LocalDate borrowDate = rs.getDate("borrow_date").toLocalDate();
                int bookId = rs.getInt("book_id");

                long days = ChronoUnit.DAYS.between(borrowDate, LocalDate.now());

                double fine = 0;
                if (days > 7) {
                    fine = (days - 7) * 5;  // ₹5 per day after 7 days
                }

                String updateRecord = "UPDATE borrow_record SET return_date=?, fine=? WHERE record_id=?";
                try (PreparedStatement updateStmt = con.prepareStatement(updateRecord)) {
                    updateStmt.setDate(1, Date.valueOf(LocalDate.now()));
                    updateStmt.setDouble(2, fine);
                    updateStmt.setInt(3, recordId);
                    updateStmt.executeUpdate();
                }

                String updateBook = "UPDATE books SET copies_available = copies_available + 1 WHERE book_id=?";
                try (PreparedStatement ps2 = con.prepareStatement(updateBook)) {
                    ps2.setInt(1, bookId);
                    ps2.executeUpdate();
                }

                System.out.println("Book returned successfully!");
                System.out.println("Fine: ₹" + fine);
            }
        }
    }

    // Advanced Search with Multiple Filters
    public static void searchBooks(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Title (or press Enter to skip): ");
        String title = sc.nextLine();

        System.out.print("Enter Author (or press Enter to skip): ");
        String author = sc.nextLine();

        System.out.print("Enter Category (or press Enter to skip): ");
        String category = sc.nextLine();

        StringBuilder sql = new StringBuilder("SELECT * FROM book WHERE 1=1");

        if (!title.isEmpty())
            sql.append(" AND title LIKE ?");

        if (!author.isEmpty())
            sql.append(" AND author LIKE ?");

        if (!category.isEmpty())
            sql.append(" AND genre LIKE ?");

        try (PreparedStatement ps = con.prepareStatement(sql.toString())) {

            int index = 1;

            if (!title.isEmpty())
                ps.setString(index++, "%" + title + "%");

            if (!author.isEmpty())
                ps.setString(index++, "%" + author + "%");

            if (!category.isEmpty())
                ps.setString(index++, "%" + category + "%");

            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Search Results ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getString("genre") + " | Available: " +
                        rs.getInt("copies_available")
                );
            }
        }
    }
}

