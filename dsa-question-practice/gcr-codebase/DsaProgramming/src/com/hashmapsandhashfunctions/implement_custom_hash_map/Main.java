package com.hashmapsandhashfunctions.implement_custom_hash_map;

public class Main {
	public static void main(String[] args) {

		CustomHashMap<String, Integer> map = new CustomHashMap<>();

		// insert elements
		map.put("Apple", 100);
		map.put("Banana", 50);
		map.put("Orange", 80);

		// retrieve values
		System.out.println("Apple price: " + map.get("Apple"));
		System.out.println("Banana price: " + map.get("Banana"));

		// update value
		map.put("Apple", 120);
		System.out.println("Updated Apple price: " + map.get("Apple"));

		// remove element
		map.remove("Banana");
		System.out.println("Banana price after removal: " + map.get("Banana"));
	}
}
