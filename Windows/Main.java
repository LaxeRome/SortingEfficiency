package Windows;
import SortingAlgorithms.*;
import java.util.*;
import java.io.*;
public class Main {
  static Scanner sin = new Scanner(System.in);
  
  public static void main(String[] args) {
    boolean AscendOrDescend = isAscending();
    sortTime();
  }

  // Purpose: User determines what order the array will be in
  public static boolean isAscending() {
    int AscendOrDescend = 0; //creates a integer called AscendOrDescend and sets it to the placeholder value of 0
    System.out.println("Would you like to sort the array in ascending order or descending order?");
    System.out.println("1. Ascending");
    System.out.println("2. Descending");
    while (AscendOrDescend != 1 && AscendOrDescend != 2) {
      try {
        AscendOrDescend = sin.nextInt(); //Gets the user to input an integer
      } 
      catch (Exception e) {  //if an exception is thrown, executes code between the braces.
        System.out.println("Please only use integers to make your selection.");
        AscendOrDescend = 0; //clears integer AscendOrDescend
        sin.next(); //clears scanner so that the program will continue
      }
      //checks if the user inputted number is equal to 1 or 2. If not, resets AscendOrDescend.
      if (AscendOrDescend != 1 && AscendOrDescend != 2) {
        System.out.println("That is not a valid selection. Please use the assigned number to make your selection.");
        AscendOrDescend = 0; 
      }
    }
    if (AscendOrDescend == 1) {
      return true;
    } else {
      return false;
    }
  }

  // Purpose: Times the amount of time it takes for the array to be sorted in milliseconds
  public static void sortTime() { 
    long begin = System.currentTimeMillis();
    createUnsortedArray();
    long end = System.currentTimeMillis();
    System.out.println(end - begin + " ms");
  }
  
  // Purpose: Creates an unsorted array that contains an n amount of integers that are chosen by the user
  public static void createUnsortedArray() {
    int arrLength = 10;
    int[] arr = new int[arrLength];
    for(int i = 0; i < arrLength; i++) {
      arr[i] = (int)(Math.random() * 20000) - 10000;
      System.out.print(arr[i] + ", ");
    }
    //BubbleSort bs = new BubbleSort();
    //BubbleSort.bubbleSort(arr);
    System.out.println("BIG CHUNGUS AMONGUS");
    QuickSort qs = new QuickSort();
    qs.quickSort(arr, 0, arrLength-1); 
  }

  	public int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
    return arr;
	}

  public void printArray(int[] arr) {
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    for(int i = 0; i < arr.length; i++) {
      if(i == arr.length-1) {
        System.out.println(arr[i]);
      }
      System.out.print(arr[i] + ", ");
    }
  }
}