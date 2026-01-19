
/*
 * FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
 */
package sortingAlgorithms.flashdealzapp;

public class Main {

    public static void main(String[] args) {

        System.out.println("******** Welcome To FlashDealz ********");

        Product[] list = {
                new Product("Smartphone", 25.0),
                new Product("Laptop", 12.0),
                new Product("Headphones", 30.0),
                new Product("Smartwatch", 18.0),
                new Product("Camera", 22.5),
                new Product("Bluetooth Speaker", 15.0),
                new Product("Tablet", 20.0),
                new Product("Gaming Console", 35.0)
        };

        QuickSort.printProductList(list, "Product List Before Sorting");
        QuickSort.quickSort(list, 0, list.length - 1);
        QuickSort.printProductList(list, "Top Discounted Products (After Sorting)");

        System.out.println("******** Thank You ********");
    }
}
