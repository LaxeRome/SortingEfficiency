package SortingAlgorithms;

public abstract class Sort {
    public int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
    return arr;
	}
}