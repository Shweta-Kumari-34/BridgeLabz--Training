package supermarketBillingQueue;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Integer> priceMap = new HashMap<>();
    private Map<String, Integer> stockMap = new HashMap<>();

    Inventory() {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Eggs", 10);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Eggs", 30);
    }

    int getPrice(String item) {
        return priceMap.getOrDefault(item, 0);
    }

    boolean isAvailable(String item) {
        return stockMap.getOrDefault(item, 0) > 0;
    }

    void reduceStock(String item) {
        stockMap.put(item, stockMap.get(item) - 1);
    }

    void printStock() {
        System.out.println("Current Stock: " + stockMap);
    }
}

