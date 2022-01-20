package SortingAlgorithms;
import Windows.*;
import java.util.*;
public class QuickSort {
    private Main main = new Main();
    // Purpose: Sorts the unsorted array using quicksort
  	public void quickSort(int[] arr, int left, int right) {
		if (left < right+1) {
      System.out.println("CHINGINGIGNGINGINGGINGINGIGNIGNGIGNIGNGIN");
			int p = partition(arr, left, right);
			quickSort(arr, left, p-1);
			quickSort(arr, p+1, right);
		}
    main.printArray(arr);
	}
	    
	private int getPivot(int left, int right) {
		Random n = new Random();
		return n.nextInt((right - left) + 1) + left;
	}

	private int partition(int[] arr, int left, int right) {
		main.swap(arr, left, getPivot(left, right));
		int border = left + 1;
		for (int i = border; i <= right; i++) {
			if (arr[i] < arr[left]) {
				main.swap(arr, i, border++);
			}
		}
		main.swap(arr, left, border-1);
		return border-1;
	}
}