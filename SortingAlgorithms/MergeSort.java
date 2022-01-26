package SortingAlgorithms;

public class MergeSort {
	public static int comparisons;

	public static void mergeSort(int[] arr) {

		if (arr.length < 2) {
			return;
		}

		int midIndex = arr.length / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[arr.length - midIndex];

		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = arr[i];
		}
		for (int i = midIndex; i < arr.length; i++) {
			rightHalf[i - midIndex] = arr[i];
		}

		mergeSort(leftHalf);
		mergeSort(rightHalf);

		merge(arr, leftHalf, rightHalf);
	}

	public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i = 0, j = 0, k = 0;

		while (i < leftSize && j < rightSize) {
			comparisons++;
			if (leftHalf[i] <= rightHalf[j]) {
				arr[k] = leftHalf[i];
				i++;
			} else {
				arr[k] = rightHalf[j];
				j++;
			}
			k++;
		}

		while (i < leftSize) {
			comparisons++;
			arr[k] = leftHalf[i];
			i++;
			k++;
		}

		while (j < rightSize) {
			comparisons++;
			arr[k] = rightHalf[j];
			j++;
			k++;
		}
	}
}