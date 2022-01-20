package SortingAlgorithms;
import Windows.*;
import java.io.*;
public class SelectionSort {
  static Main main = new Main();
private static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minValue = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[minValue])
					minValue = j;
          main.swap(arr, minValue, i);
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
    try {
      FileWriter Writer = new FileWriter("SelectionSortedNumbers.txt");
      Writer.write("Lorem Ipsum");
      Writer.close();
    } catch (IOException e) {
      System.out.println("An error has occured.");
      e.printStackTrace();
    }
	}
}