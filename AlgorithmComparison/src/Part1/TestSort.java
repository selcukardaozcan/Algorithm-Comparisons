package Part1;

import java.util.Random;

public class TestSort {


	// We need that to compare two Sorting algorithm whether it's convenient for
	// larger data sets.
	// Hence, we need a random array generator.
	public static int[] createRandomArray(int size) {
		int[] array = new int[size];
		Random random = new Random();

		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt();
		}

		return array;
	}


	public static void main(String[] args) {

		int[] instance1 = { 8, 3, 7, 4, 2, 6, 1, 5 };
		int[] instance2 = { 1, 2, 5, 3, 4, 6, 7, 8 };

		int[] instance3 = createRandomArray(1000);
		
		Selection selection= new Selection();
		Merge merge = new Merge();

		// Measure time for Selection Sort on instance1
		long startTime = System.nanoTime();
		selection.selectionSort(instance1);
		long endTime = System.nanoTime();
		long durationSelectionSortInstance1 = endTime - startTime;
		System.out.println("Selection Sort on instance1 took: " + durationSelectionSortInstance1 / 1_000_000.0 + " milliseconds");

		// Measure time for Merge Sort on instance1
		startTime = System.nanoTime();
		merge.mergeSort(instance1);
		endTime = System.nanoTime();
		long durationMergeSortInstance1 = endTime - startTime;
		System.out.println("Merge Sort on instance1 took: " + durationMergeSortInstance1 / 1_000_000.0 + " milliseconds");

		System.out.println();

		// Measure time for Selection Sort on instance2
		startTime = System.nanoTime();
		selection.selectionSort(instance2);
		endTime = System.nanoTime();
		long durationSelectionSortInstance2 = endTime - startTime;
		System.out.println("Selection Sort on instance2 took: " + durationSelectionSortInstance2 / 1_000_000.0 + " milliseconds");

		// Measure time for Merge Sort on instance2
		startTime = System.nanoTime();
		merge.mergeSort(instance2);
		endTime = System.nanoTime();
		long durationMergeSortInstance2 = endTime - startTime;
		System.out.println("Merge Sort on instance2 took: " + durationMergeSortInstance2 / 1_000_000.0 + " milliseconds");

		System.out.println();

		// Measure time for Selection Sort on instance3
		startTime = System.nanoTime();
		selection.selectionSort(instance3);
		endTime = System.nanoTime();
		long durationSelectionSortInstance3 = endTime - startTime;
		System.out.println("Selection Sort on instance3 took: " + durationSelectionSortInstance3 / 1_000_000.0 + " milliseconds");

		// Measure time for Merge Sort on instance3
		startTime = System.nanoTime();
		merge.mergeSort(instance3);
		endTime = System.nanoTime();
		long durationMergeSortInstance3 = endTime - startTime;
		System.out.println("Merge Sort on instance3 took: " + durationMergeSortInstance3 / 1_000_000.0 + " milliseconds");

		
		
	}
}