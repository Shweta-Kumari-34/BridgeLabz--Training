package digital_bookstore_system;

	public abstract class Book implements IDiscountable {

	    private String title;
	    private String author;
	    private double price;
	    private int stock;

	    public Book(String title, String author, double price, int stock) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.stock = stock;
	    }

	    public Book(String title, String author, double price) {
	        this(title, author, price, 10);
	    }

	    public String getTitle() {
	        return title;
	    }

	    protected double getPrice() {
	        return price;
	    }

	    public int getStock() {
	        return stock;
	    }

	    public boolean updateStock(int quantity) {
	        if (quantity <= stock) {
	            stock -= quantity;
	            return true;
	        }
	        return false;
	    }
	}


