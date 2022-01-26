package SortingAlgorithms;
import Windows.*;
import java.util.*;
public class QuickSort extends Sort{
	public int comparisons;
    // Purpose: Sorts the unsorted array using quicksort
  	public void quickSort(int[] arr, int left, int right) {
		if (left <= right) { //executes if the value of left is less than or equal to the value of right
			int p = partition(arr, left, right); //calls partition method
			quickSort(arr, left, p-1); //calls quicksort method from within quicksort method
			quickSort(arr, p+1, right); //calls quicksort method from within quicksort method
		} 
	}
	    
	private int getPivot(int left, int right) {
		Random n = new Random();//creates a class that can generate a random number
		return n.nextInt((right - left) + 1) + left; //returns 
	}

	private int partition(int[] arr, int left, int right) {
		swap(arr, left, getPivot(left, right)); //calls the method swap
		int border = left + 1; //creates integer border and makes it equal to the value of left + 1
		for (int i = border; i <= right; i++) { //sets i to the value of border and executes code in the brackets until i is less than or equal to right. i is increased by one each time 
			comparisons++; //counts the number of comparisons it took to sort the array
			if (arr[i] < arr[left]) {
				swap(arr, i, border++);
			}
		}
		swap(arr, left, border-1); //calls the method swap 
		return border-1;
	}
}