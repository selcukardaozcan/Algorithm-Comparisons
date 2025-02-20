package Part1;



public class Merge  {

	public static void mergeSort(int[] inputArray) {

		int inputLength = inputArray.length;

		// if input array has only one element and sorted , there is no need to use mergeSort()
		if (inputLength < 2) {
			return;
		}

		int midIndex = inputLength / 2;

		// Creating two sub arrays to store the elements of the previous array.
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];

		// Store the left side of the array into the new array
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}

		// Store the right side of the array into the new array 
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i-midIndex] = inputArray[i];
		}

		// Continue to divide arrays until just one element remains in the array for
		// both right and left side.
		mergeSort(leftHalf);
		mergeSort(rightHalf);

		// Then , merge arrays again into one piece after the dividing process 
		merge(inputArray, leftHalf, rightHalf);

	}

	public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i = 0, j = 0, k = 0; //each indexes are exclusive for each array

		// Merging from right and left side until there is no more element left.
		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}

			k++;
		}

		// It adds the last remaining element which is the biggest to the new array.
		while (i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;

		}
		while (j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;

		}

	}
}