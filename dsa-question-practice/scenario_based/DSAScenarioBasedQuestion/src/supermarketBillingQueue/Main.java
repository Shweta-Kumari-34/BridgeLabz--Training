package supermarketBillingQueue;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

        Inventory inventory = new Inventory();
        CheckoutCounter counter = new CheckoutCounter(inventory);

        Customer c1 = new Customer("Amit", Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Neha", Arrays.asList("Eggs", "Milk", "Eggs"));

        counter.addCustomer(c1);
        counter.addCustomer(c2);

        counter.processCustomer();
        inventory.printStock();

        counter.processCustomer();
        inventory.printStock();
    }
}
