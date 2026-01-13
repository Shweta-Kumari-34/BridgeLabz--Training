package library_organizer;

public class Main {
    public static void main(String[] args) {

        LibraryOrganizer lib = new LibraryOrganizer();

        Book b1 = new Book("Harry Potter", "J.K. Rowling", "ISBN101");
        Book b2 = new Book("The Alchemist", "Paulo Coelho", "ISBN102");
        Book b3 = new Book("Atomic Habits", "James Clear", "ISBN103");

        lib.addBook("Fiction", b1);
        lib.addBook("Fiction", b2);
        lib.addBook("Self Help", b3);

        lib.displayLibrary();

        lib.removeBook("Fiction", "ISBN101");

        lib.displayLibrary();
    }
}

