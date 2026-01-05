package swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;  

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public Cart(ArrayList<Product> items) {
        this.products = items;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity; 
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    public void applyDiscount() {
        double discount = 0;

        for (Product p : products) {
            discount += p.getDiscount(totalPrice); // polymorphism
        }

        totalPrice = totalPrice - discount; // operator usage
    }


    public void generateBill() {
        System.out.println("\n----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println(p.getName() + " - " + p.category);
        }
        System.out.println("Final Amount: ₹" + totalPrice);
    }
}

