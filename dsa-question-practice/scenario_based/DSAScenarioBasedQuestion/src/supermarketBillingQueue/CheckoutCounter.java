package supermarketBillingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class CheckoutCounter {

    private Queue<Customer> queue = new LinkedList<>();
    private Inventory inventory;

    CheckoutCounter(Inventory inventory) {
        this.inventory = inventory;
    }

    void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.name + " joined the queue");
    }

    void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = queue.poll();
        int totalBill = 0;

        System.out.println("Billing customer: " + customer.name);

        for (String item : customer.items) {
            if (inventory.isAvailable(item)) {
                int price = inventory.getPrice(item);
                totalBill += price;
                inventory.reduceStock(item);
                System.out.println(item + " added - ₹" + price);
            } else {
                System.out.println(item + " out of stock");
            }
        }

        System.out.println("Total bill for " + customer.name + ": ₹" + totalBill);
    }
}

