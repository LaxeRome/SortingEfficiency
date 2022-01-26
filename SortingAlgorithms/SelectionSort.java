package SortingAlgorithms;

import Windows.*;
import java.io.*;

public class SelectionSort extends Sort {
	public int comparisons;
	public void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) { //runs the code 
      //between the braces while i is less than the length of arr. i is increased by one each time the code is run.
			int minValue = i; //sets the minimum value to the value of i
			for (int j = i; j < arr.length; j++) { //runs the code 
      //between the braces while j is less than the length of arr. j is increased by one each time the code is run.
        comparisons++; //counts the number of comparisons it took to sort the array
				if (arr[j] < arr[minValue]) {
					minValue = j; //sets the minimum value to the value of j
				}
			}
			swap(arr, minValue, i); //calls the method swap
		}
	}
}