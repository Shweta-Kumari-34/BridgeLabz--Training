package swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    public double getDiscount(double totalPrice) {
        return totalPrice * 0.10; 
    }
}
