package questions.ShoppingCart;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add products to store
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.75);
        cart.addProduct("Milk", 2.0);
        cart.addProduct("Bread", 1.25);

        // Add items to cart
        cart.addToCart("Milk");
        cart.addToCart("Apple");
        cart.addToCart("Bread");
        cart.addToCart("Banana");

        // Display cart in different ways
        cart.displayCartHashMap();
        System.out.println();
        cart.displayCartLinkedHashMap();
        System.out.println();
        cart.displayCartTreeMap();
        System.out.println();

        // Display total
        System.out.println("Total: $" + cart.getTotal());
    }
}

