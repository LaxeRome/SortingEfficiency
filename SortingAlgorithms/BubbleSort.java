package SortingAlgorithms;
import java.io.*;
public class BubbleSort extends Sort{
  public int comparisons;
    public void bubbleSort(int[] arr) {
      boolean sorted = false;
      comparisons = 0; 
      while (!sorted) {
        sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
          for (int j = 0; j < arr.length - i - 1; j++) {
            comparisons++;
            if (arr[j] > arr[j + 1]) {
              swap(arr, j+1, j);
              sorted = false;
            }
          }     
        }
      }       
    }
}