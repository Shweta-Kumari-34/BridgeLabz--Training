package sortingAlgorithms.flashdealzapp;

public class QuickSort {

    public static int partition(Product[] arr, int low, int high) {

        Product pivot = arr[high]; // pivot product
        int left = low - 1;

        for (int right = low; right < high; right++) {
            // Descending order: higher discount first
            if (arr[right].compareTo(pivot) > 0) {
                left++;
                swap(arr, left, right);
            }
        }

        swap(arr, left + 1, high);
        return left + 1;
    }

    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static void swap(Product[] arr, int i, int j) {
        Product temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printProductList(Product[] arr, String text) {
        System.out.println(text);
        for (int i = 0; i < arr.length; i++) {
            Product p = arr[i];
            System.out.printf("%-3d %-20s %.2f%%%n",
                    (i + 1), p.getProductName(), p.getDiscount());
        }
        System.out.println("=======================================");
    }
}
