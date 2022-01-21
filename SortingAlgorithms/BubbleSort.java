package SortingAlgorithms;
import Windows.*;
import java.io.*;
public class BubbleSort extends Sort{
    public static void bubbleSort(int[] arr) {
      boolean sorted = false;
      int comparison = 0; 
      while (!sorted) {
        sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
          for (int j = 0; j < arr.length - i - 1; j++) {
            comparison++;
            if (arr[j] > arr[j + 1]) {
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
              sorted = false;
            }
          }     
        }
      }       
      for(int i = 1; i < arr.length; i++) {
        int temp = arr[i];
        int j = i - 1;
      }

      for(int i = 0; i < arr.length; i++) { 
        System.out.print(arr[i] + ", ");
      }
      
      try {
        FileWriter Writer = new FileWriter("BubbleSortedNumbers.txt");
        Writer.write("Lorem Ipsum");
        Writer.close();
      } catch (IOException e) {
        System.out.println("An error occured.");
        e.printStackTrace();
      }
    }
}