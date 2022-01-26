package SortingAlgorithms;

public abstract class Sort {
    public int[] swap(int[] arr, int i, int j) {
		int temp = arr[i]; //creates a integer called temp and gives it the value of arr[i]
		arr[i] = arr[j]; //makes arr[i] equal to the value of arr[j]
		arr[j] = temp; //makes arr[j] equal to the value of temp
    return arr; //returns arr to the method that called Sort
	}
}