package com.objectdiagram.grocerystorebillgeneration;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Alice");

        Product p1 = new Product("Apples", 3.0, 2); // 2 kg @ $3/kg
        Product p2 = new Product("Milk", 2.0, 1);   // 1 liter @ $2/liter

        customer.addProduct(p1);
        customer.addProduct(p2);

        BillGenerator billGen = new BillGenerator();
        billGen.generateReceipt(customer);
    }
}
