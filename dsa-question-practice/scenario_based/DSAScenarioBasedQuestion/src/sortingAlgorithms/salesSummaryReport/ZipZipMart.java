
package sortingAlgorithms.salesSummaryReport;

import java.util.*;

public class ZipZipMart {

    public static void merge(List<Transaction> report, int low, int mid, int high) {

        List<Transaction> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {

            Transaction a = report.get(left);
            Transaction b = report.get(right);

  
            if (a.date.compareTo(b.date) < 0) {
                temp.add(report.get(left++));
            }
            else if (a.date.compareTo(b.date) == 0 && a.amount <= b.amount) {
                temp.add(report.get(left++));
            }
            else {
                temp.add(report.get(right++));
            }
        }

        while (left <= mid)
            temp.add(report.get(left++));

        while (right <= high)
            temp.add(report.get(right++));

        for (int i = 0; i < temp.size(); i++) {
            report.set(low + i, temp.get(i));
        }
    }

    public static void mergeSort(List<Transaction> report, int low, int high) {

        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergeSort(report, low, mid);
        mergeSort(report, mid + 1, high);
        merge(report, low, mid, high);
    }

    public static void printReport(List<Transaction> list) {
        System.out.println("Sales Report:");
        for (Transaction t : list) {
            t.display();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Transaction> report = new ArrayList<>();

        System.out.println("Welcome to ZipZipMart");
        System.out.print("Enter the number of reports: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Enter details of transaction " + (i + 1));

            System.out.print("Enter the date (YYYY-MM-DD): ");
            String date = input.next();

            System.out.print("Enter the amount: ");
            double amount = input.nextDouble();

            Transaction t = new Transaction(date, amount);
            report.add(t);
        }

        mergeSort(report, 0, report.size() - 1);

        printReport(report);

        input.close();
    }
}
