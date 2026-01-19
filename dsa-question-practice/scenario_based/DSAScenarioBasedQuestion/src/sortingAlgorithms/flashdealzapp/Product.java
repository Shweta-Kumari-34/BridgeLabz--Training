package sortingAlgorithms.flashdealzapp;

public class Product implements Comparable<Product> {

    private String productName;
    private double discount;

    public Product(String name, double discount) {
        this.productName = name;
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.discount, other.discount);
    }
}
