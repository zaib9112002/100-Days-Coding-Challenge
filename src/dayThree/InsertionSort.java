package dayThree;

public class InsertionSort {

	public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 2,1};
        int n = arr.length;
        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive Insertion Sort
    public static void insertionSort(int[] arr, int n) {
        // Base case: single element is always sorted
        if (n <= 1) {
            return;
        }

        // Sort first n-1 elements recursively
        insertionSort(arr, n - 1);

        // Insert last element at its correct position in sorted array
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }
}
