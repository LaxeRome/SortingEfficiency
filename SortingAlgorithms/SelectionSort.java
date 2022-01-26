package SortingAlgorithms;

import Windows.*;
import java.io.*;

public class SelectionSort extends Sort {
	public int comparisons;
	public void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minValue = i;
			for (int j = i; j < arr.length; j++) {
        comparisons++;
				if (arr[j] < arr[minValue]) {
					minValue = j;
				}
			}
			swap(arr, minValue, i);
		}
	}
}