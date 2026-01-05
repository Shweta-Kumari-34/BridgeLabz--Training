package swiftcart;

public class Product {

    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getDiscount(double totalPrice) {
        return 0;
    }

    public String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
    }
}

