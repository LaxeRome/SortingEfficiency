package SortingAlgorithms;

public abstract class Sort {
    public int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
    return arr;
	}

    public void printArray(int[] arr) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
