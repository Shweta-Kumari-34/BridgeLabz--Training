package questions.ShoppingCart;

import java.util.*;

public class ShoppingCart {

    Map<String, Double> productPrices = new HashMap<>();          // Store prices quickly
    Map<String, Double> cartLinked = new LinkedHashMap<>();       // Maintain order added

    // Add product to store
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Add product to cart
    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            cartLinked.put(product, productPrices.get(product));
        } else {
            System.out.println("Product not found: " + product);
        }
    }

    // Display cart using HashMap (unordered)
    public void displayCartHashMap() {
        System.out.println("Cart (HashMap - unordered):");
        for (Map.Entry<String, Double> entry : new HashMap<>(cartLinked).entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    // Display cart in order added (LinkedHashMap)
    public void displayCartLinkedHashMap() {
        System.out.println("Cart (LinkedHashMap - insertion order):");
        for (Map.Entry<String, Double> entry : cartLinked.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    // Display cart sorted by price (TreeMap)
    public void displayCartTreeMap() {
        // TreeMap sorts by key, so we create a custom sorted map by value
        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Double> entry : cartLinked.entrySet()) {
            double price = entry.getValue();
            sortedByPrice.putIfAbsent(price, new ArrayList<>());
            sortedByPrice.get(price).add(entry.getKey());
        }

        System.out.println("Cart (TreeMap - sorted by price):");
        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + ": $" + entry.getKey());
            }
        }
    }

    // Calculate total price
    public double getTotal() {
        double total = 0;
        for (double price : cartLinked.values()) {
            total += price;
        }
        return total;
    }
}
