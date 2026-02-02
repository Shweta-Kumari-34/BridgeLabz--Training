package com.foreachmethod.stockpricelogger;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {

	public static void main(String[] args) {

		// list of stock prices coming from live feed
		List<Double> stockPrices = Arrays.asList(1023.50, 998.75, 1102.30, 1045.00);

		// using forEach to display each stock price
		stockPrices.forEach(price -> System.out.println("Current stock price: " + price));
	}
}
