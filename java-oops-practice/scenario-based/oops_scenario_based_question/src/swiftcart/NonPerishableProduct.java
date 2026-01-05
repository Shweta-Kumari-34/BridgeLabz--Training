package swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    public double getDiscount(double totalPrice) {
        return totalPrice * 0.05; 
    }
}

