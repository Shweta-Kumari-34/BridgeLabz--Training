package sortingAlgorithms.smartlibraryapp;

public class User implements Comparable<User> {
private String bookTitle;
private String userName;

User(String bookTitle, String userName){
	this.bookTitle= bookTitle;
	this.userName=userName;
}

public String getBookTitle() {
	return bookTitle;
}
public String getUserName() {
	return userName;
}

@Override
public int compareTo(User other) {
	return this.bookTitle.compareToIgnoreCase(other.bookTitle);
	
}
}
