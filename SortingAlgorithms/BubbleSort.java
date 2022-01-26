package SortingAlgorithms;
import java.io.*;
public class BubbleSort extends Sort{
  public int comparisons;
    public void bubbleSort(int[] arr) {
      boolean sorted = false;
      comparisons = 0;
      while (!sorted) { //while sorted is false
        sorted = true; //sets sorted to true
        for (int i = 0; i < arr.length - 1; i++) {
          for (int j = 0; j < arr.length - i - 1; j++) {
            comparisons++; //counts the number of comparisons it took to sort the array
            if (arr[j] > arr[j + 1]) { //if arr[j] is greater than arr[j+1]
              swap(arr, j+1, j); //calls swap method
              sorted = false; //sets sorted to false
            }
          }     
        }
      }       
    }
}