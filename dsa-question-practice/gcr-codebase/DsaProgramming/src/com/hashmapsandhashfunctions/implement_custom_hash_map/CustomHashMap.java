package com.hashmapsandhashfunctions.implement_custom_hash_map;
	import java.util.LinkedList;


	public class CustomHashMap<K, V> {

	    // Node class for key-value pairs
	    private class Entry {
	        K key;
	        V value;

	        Entry(K key, V value) {
	            this.key = key;
	            this.value = value;
	        }
	    }

	    private int capacity = 10; // Size of array
	    private LinkedList<Entry>[] table;

	    // Constructor
	    @SuppressWarnings("unchecked")
	    public CustomHashMap() {
	        table = new LinkedList[capacity];
	    }

	    // Hash function
	    private int getIndex(K key) {
	        return Math.abs(key.hashCode()) % capacity;
	    }

	    // Insert or update key-value pair
	    public void put(K key, V value) {
	        int index = getIndex(key);

	        if (table[index] == null) {
	            table[index] = new LinkedList<>();
	        }

	        // Check if key already exists
	        for (Entry entry : table[index]) {
	            if (entry.key.equals(key)) {
	                entry.value = value; // Update value
	                return;
	            }
	        }

	        // Add new entry
	        table[index].add(new Entry(key, value));
	    }

	    // Retrieve value by key
	    public V get(K key) {
	        int index = getIndex(key);

	        if (table[index] == null) {
	            return null;
	        }

	        for (Entry entry : table[index]) {
	            if (entry.key.equals(key)) {
	                return entry.value;
	            }
	        }

	        return null;
	    }

	    // Remove key-value pair
	    public void remove(K key) {
	        int index = getIndex(key);

	        if (table[index] == null) {
	            return;
	        }

	        table[index].removeIf(entry -> entry.key.equals(key));
	    }
	}

