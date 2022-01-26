package SortingAlgorithms;

public class MergeSort {
	public static int comparisons;

	public static void mergeSort(int[] arr) {

		if (arr.length < 2) { //if arr.length is less than 2, the program returns back to where mergeSort was called from
			return;
		}

		int midIndex = arr.length / 2; //sets the value of midIndex 
		int[] leftHalf = new int[midIndex]; //creates the array of integers leftHalf and give it room to fit midIndex number of integers 
		int[] rightHalf = new int[arr.length - midIndex]; //creates the array of integers leftHalf and give it room to fit arr.length - midIndex number of integers 

		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = arr[i]; //sets leftHalf[i] equal to the value of arr[i]
		}
		for (int i = midIndex; i < arr.length; i++) {
			rightHalf[i - midIndex] = arr[i];  //sets leftHalf[i - midIndex] equal to the value of arr[i]
		}

		mergeSort(leftHalf); //calls mergesort method
		mergeSort(rightHalf); //calls mergesort method

		merge(arr, leftHalf, rightHalf); //calls merge method
	}

	public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length; //sets value leftSize equal to leftHalf.length
		int rightSize = rightHalf.length; //sets value rightSize equal to rightHalf.length

		int i = 0, j = 0, k = 0; //sets integers i, j, and k all equal to 0

		while (i < leftSize && j < rightSize) {
			comparisons++; //counts the number of comparisons it took to sort the array
			if (leftHalf[i] <= rightHalf[j]) {
				arr[k] = leftHalf[i];
				i++;
			} else {
				arr[k] = rightHalf[j];
				j++;
			}
			k++;
		}

		while (i < leftSize) { //while i is less than leftSize
			comparisons++; //counts the number of comparisons it took to sort the array
			arr[k] = leftHalf[i]; //arr[k] is set equal to leftHalf[i]
			i++;//i increases by 1
			k++; //k increases by 1
		}

		while (j < rightSize) { //while j is less than rightSize
			comparisons++;
			arr[k] = rightHalf[j];
			j++;//j increases by 1
			k++;//k increases by 1
		}
	}
}