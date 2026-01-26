package ecommercediscountvalidator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DealTracker {

    Map<String, Deal> dealMap = new HashMap<>();
    Set<String> dealCodes = new HashSet<>();

    Pattern codePattern = Pattern.compile("DealCode:\\s*(.*)");
    Pattern validPattern = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    Pattern discountPattern = Pattern.compile("Discount:\\s*(\\d+%)");
    Pattern minPattern = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    void loadDeals(String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            String code = "", valid = "", discount = "", min = "";

            while ((line = br.readLine()) != null) {
                line = line.trim();
                Matcher m;

                if ((m = codePattern.matcher(line)).matches()) code = m.group(1);
                if ((m = validPattern.matcher(line)).matches()) valid = m.group(1);
                if ((m = discountPattern.matcher(line)).matches()) discount = m.group(1);
                if ((m = minPattern.matcher(line)).matches()) min = m.group(1);

                if (!code.isEmpty() && !valid.isEmpty() && !discount.isEmpty() && !min.isEmpty()) {
                    LocalDate expiry = LocalDate.parse(valid, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    if (expiry.isAfter(LocalDate.now()) && !dealCodes.contains(code)) {
                        Deal deal = new Deal(code, valid, discount, min);
                        dealMap.put(code, deal);
                        dealCodes.add(code);
                    }
                    code = valid = discount = min = "";
                }
            }

        } catch (IOException e) {
            System.out.println("File reading error");
        }
    }

    void printDeals() {
        for (Deal deal : dealMap.values()) {
            System.out.println(deal);
        }
    }

    void printDealsByDiscount() {
        List<Deal> list = new ArrayList<>(dealMap.values());
        list.sort((a, b) -> b.discount - a.discount);
        System.out.println("\nDeals sorted by discount:");
        for (Deal deal : list) {
            System.out.println(deal);
        }
    }

    public static void main(String[] args) {
        DealTracker tracker = new DealTracker();
        tracker.loadDeals("D:\\java file\\ExceptionHandling.txt");
        tracker.printDeals();
        tracker.printDealsByDiscount();
    }
}
