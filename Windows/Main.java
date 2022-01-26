package Windows;

import SortingAlgorithms.*;
import java.util.*;
import java.io.*;

public class Main {
	static boolean isAscending;
	static Scanner sin = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		isAscending = isAscending();
		createUnsortedArray();
	}

	// Purpose: User determines what order the array will be in
	public static boolean isAscending() {
		int AscendOrDescend = 0; // creates a integer called AscendOrDescend and sets it to the placeholder value
									// of 0
		System.out.println("Would you like to sort the array in ascending order or descending order? Press 1 or 2");
		System.out.println("1. Ascending");
		System.out.println("2. Descending");
		while (AscendOrDescend != 1 && AscendOrDescend != 2) {
			try {
				AscendOrDescend = sin.nextInt(); // Gets the user to input an integer
			} catch (Exception e) { // if an exception is thrown, executes code between the braces.
				System.out.println("Please only use integers to make your selection.");
			}
			// checks if the user inputted number is equal to 1 or 2. If not, resets
			// AscendOrDescend.
			if (AscendOrDescend != 1 && AscendOrDescend != 2) {
				System.out.println(
						"That is not a valid selection. Please use the assigned number to make your selection.");
			}
		}
		if (AscendOrDescend == 1) {
			return true;
		} else {
			return false;
		}
	}

	// Purpose: Creates an unsorted array that contains an n amount of integers that
	// are chosen by the user
	public static void createUnsortedArray() throws IOException {
		int arrLength = 0;
		System.out.println("Would you like to create 10, 100, 1000, or 5000 numbers?");
		while (arrLength != 10 && arrLength != 100 && arrLength != 1000 && arrLength != 5000) {
			try {
				arrLength = sin.nextInt();
			} catch (Exception e) { // if exception is thrown, executes code in between the braces
				System.out.println(
						"An error has occured. Please make sure you only use integers to make your selection.");
				arrLength = 0;
				sin.next(); // clears scanner
			}
			if (arrLength != 10 && arrLength != 100 && arrLength != 1000 && arrLength != 5000) {
				System.out.println(
						"That is not a valid selection. Please use either 10, 100, 1000, or 5000 to make your selection.");
				arrLength = 0;
			}
		}
		int[] arr = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			arr[i] = (int) (Math.random() * 20000) - 10000;
		}
		sortTheArray(arr);
	}

	public static void sortTheArray(int[] arr) throws IOException {
		int[] quickSorted = Arrays.copyOf(arr, arr.length);
		int[] bubbleSorted = Arrays.copyOf(arr, arr.length);
		int[] selectionSorted = Arrays.copyOf(arr, arr.length);
		int[] mergeSorted = Arrays.copyOf(arr, arr.length);

		QuickSort qs = new QuickSort();
		BubbleSort bs = new BubbleSort();
		SelectionSort ss = new SelectionSort();
		MergeSort ms = new MergeSort();

		long quickBegin = System.currentTimeMillis();
		qs.quickSort(quickSorted, 0, arr.length - 1);
		long quickEnd = System.currentTimeMillis();

		long bubbleBegin = System.currentTimeMillis();
		bs.bubbleSort(bubbleSorted);
		long bubbleEnd = System.currentTimeMillis();

		long selectionBegin = System.currentTimeMillis();
		ss.selectionSort(selectionSorted);
		long selectionEnd = System.currentTimeMillis();

		long mergeBegin = System.currentTimeMillis();
		ms.mergeSort(mergeSorted);
		long mergeEnd = System.currentTimeMillis();

		System.out.println("\nBubble Sort: " + (bubbleEnd - bubbleBegin) + " ms");
		System.out.println("Comparisons: " + bs.comparisons + "\n");
		System.out.println("Selection Sort: " + (selectionEnd - selectionBegin) + " ms");
		System.out.println("Comparisions: " + ss.comparisons + "\n");
		System.out.println("Quick Sort: " + (quickEnd - quickBegin) + " ms");
		System.out.println("Comparisons: " + qs.comparisons + "\n");
		System.out.println("Merge Sort: " + (mergeEnd - mergeBegin) + " ms");
		System.out.println("Comparisons: " + ms.comparisons + "\n");

		write("unsorted", arr);
		write("bubbleSort", bubbleSorted);
		write("selectionSort", selectionSorted);
		write("quickSort", quickSorted);
		write("mergeSort", mergeSorted);
	}

	public static void write(String filename, int[] arr) throws IOException {
		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(new FileWriter(filename + ".txt"));
		if (isAscending == true) {
			for (int i = 0; i < arr.length; i++) {
				if (i % 20 == 0 && i > 0) {
					outputWriter.write(arr[i] + "\n");
				} else {
					outputWriter.write(arr[i] + " ");
				}
			}
		} else {
			for (int i = arr.length - 1; i >= 0; i--) {
				if (i % 20 == 0 && i < arr.length - 1) {
					outputWriter.write(arr[i] + "\n");
				} else {
					outputWriter.write(arr[i] + " ");
				}
			}
		}
		outputWriter.close();
	}

}