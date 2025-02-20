package Part1;

public class Selection  {

	public static int[] selectionSort(int[] array) {

		int temp;
		int min;
		int n = array.length;

		// Finds the minimum value in the array and moves it into first.
		for (int i = 0; i < n - 1; i++) {
			min = i;

			// We are aware of the first element is the smallest number .
			// It doesn't require for index j to start from index i, no need to compare again. So jump one step forward.
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			
			//Basic swapping operation
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;

	}

}
