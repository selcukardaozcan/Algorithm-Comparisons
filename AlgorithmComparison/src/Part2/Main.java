package Part2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		HashTable<Integer> hsh = new HashTable<Integer>();
		
		
		long startTime = System.nanoTime();
		bst.put(5);
		bst.put(10);
		bst.put(3);
		System.out.println("Key 10 exists: " + bst.get(10));
		System.out.println("Key 5 exists: " + bst.get(5));
		System.out.println("Key 7 exists: " + bst.get(7)); // Should return false
		bst.display();
		long endTime = System.nanoTime();
		long durationBSTSearchSequence1 = endTime - startTime;
		System.out.println("BST Search on sequence1 took: " + durationBSTSearchSequence1 / 1_000_000.0 + " milliseconds");

	
		System.out.println();
		
		startTime = System.nanoTime();
		hsh.put(5);
		hsh.put(10);
		hsh.put(3);
		System.out.println("Key 10 exists: " + hsh.get(10));
		System.out.println("Key 5 exists: " + hsh.get(5));
		System.out.println("Key 7 exists: " + hsh.get(7)); // Should return false
		hsh.display();
		endTime = System.nanoTime();
		long durationHashTableSequence1 = endTime - startTime;
		System.out.println("HashTable on sequence1 took: " + durationHashTableSequence1 / 1_000_000.0 + " milliseconds");

		
		
		
		System.out.println();
		
		startTime = System.nanoTime();
		bst.put(2);
		bst.put(4);
		bst.put(1);
		System.out.println("Key 10 exists: " + bst.get(3));
		System.out.println("Key 5 exists: " + bst.get(4));
		bst.put(6);
		System.out.println("Key 5 exists: " + bst.get(6));
		bst.display();
		endTime = System.nanoTime();
		long durationBSTSearchSequence2 = endTime - startTime;
		System.out.println("HashTable on sequence2 took: " + durationBSTSearchSequence2 / 1_000_000.0 + " milliseconds");

		
		
		System.out.println();
		
		startTime = System.nanoTime();
		hsh.put(2);
		hsh.put(4);
		hsh.put(1);
		System.out.println("Key 10 exists: " + hsh.get(3));
		System.out.println("Key 5 exists: " + hsh.get(4));
		hsh.put(6);
		System.out.println("Key 5 exists: " + hsh.get(6));
		hsh.display();
		endTime = System.nanoTime();
		long durationHashTableSequence2 = endTime - startTime;
		System.out.println("HashTable on sequence2 took: " + durationHashTableSequence2 / 1_000_000.0 + " milliseconds");

		
		
	}
}
