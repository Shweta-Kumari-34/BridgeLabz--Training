package com.objectdiagram.grocerystorebillgeneration;

public class BillGenerator {

    public double calculateBill(Customer customer) {
        return customer.getTotalAmount();
    }

    public void generateReceipt(Customer customer) {
        System.out.println("------ Grocery Bill ------");
        System.out.println("Customer: " + customer.getName());
        System.out.println("--------------------------");
        System.out.println("Items Purchased:");

        for (Product p : customer.getProducts()) {
            System.out.println(p.getProductName() + " - " +
                               p.getQuantity() + " units x $" + p.getPricePerUnit() +
                               " = $" + p.getCost());
        }

        System.out.println("--------------------------");
        System.out.println("Total Amount: $" + calculateBill(customer));
        System.out.println("--------------------------");
    }
}

