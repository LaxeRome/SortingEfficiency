package SortingAlgorithms;
import Windows.*;
import java.util.*;
public class QuickSort extends Sort{
    // Purpose: Sorts the unsorted array using quicksort
  	public void quickSort(int[] arr, int left, int right) {
		if (left <= right) {
			int p = partition(arr, left, right);
			quickSort(arr, left, p-1);
			quickSort(arr, p+1, right);
		} 
		printArray(arr);
	}
	    
	private int getPivot(int left, int right) {
		Random n = new Random();
		return n.nextInt((right - left) + 1) + left;
	}

	private int partition(int[] arr, int left, int right) {
		swap(arr, left, getPivot(left, right));
		int border = left + 1;
		for (int i = border; i <= right; i++) {
			if (arr[i] < arr[left]) {
				swap(arr, i, border++);
			}
		}
		swap(arr, left, border-1);
		return border-1;
	}
}