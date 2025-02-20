package Part2;

import java.util.LinkedList;

public class HashTable<T> {

	private class Entry {
		T key;

		public Entry(T key) {
			this.key = key;
		}
	}

	private static final int size = 10;
	private LinkedList<Entry>[] table;

	// Constructor to initialize the hash table
	public HashTable() {
		table = new LinkedList[size];
		for (int i = 0; i < size; i++) {
			table[i] = new LinkedList<>();
		}
	}

	// Hash function to determine the index for a given key
	private int hashFunction(T key) {
		return key.hashCode() % size;
	}

	// Insert a key into the hash table
	public void put(T key) {
		int index = hashFunction(key);
		for (Entry entry : table[index]) {
			if (entry.key.equals(key)) {
				return; // Key already exists, no need to insert
			}
		}
		table[index].add(new Entry(key)); // Add new entry if key does not exist
	}

	// Check if a key exists in the hash table
	public boolean get(T key) {
		int index = hashFunction(key);
		for (Entry entry : table[index]) {
			if (entry.key.equals(key)) {
				return true; // Key found
			}
		}
		return false; // Key not found
	}

	// Method to display the hash table for visualization
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print("Index " + i + ": ");
			for (Entry entry : table[i]) {
				System.out.print("{" + entry.key + "} ");
			}
			System.out.println();
		}
	}

}
