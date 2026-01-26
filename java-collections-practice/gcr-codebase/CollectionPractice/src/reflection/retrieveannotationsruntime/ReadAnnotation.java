package reflection.retrieveannotationsruntime;

public class ReadAnnotation {
	public static void main(String[] args) {

		// Get class object
		Class<Book> cls = Book.class;

		// Check if annotation is present
		if (cls.isAnnotationPresent(Author.class)) {

			// Get annotation
			Author author = cls.getAnnotation(Author.class);

			// Print annotation value
			System.out.println("Author Name: " + author.name());
		}
	}
}
