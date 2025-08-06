package dayThree;

public class SelectionSort {

	public static void main(String[] args) {
        int[] arr = {6, 3, 4,1, 5, 2};
        int n = arr.length;
        selectionSort(arr, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive Selection Sort
    public static void selectionSort(int[] arr, int start, int n) {
        // Base case: when starting index reaches the end
        if (start >= n - 1) {
            return;
        }

        // Find the index of the minimum element in the unsorted part
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the found minimum with the first element of unsorted part
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        // Recur for the remaining unsorted part
        selectionSort(arr, start + 1, n);
    }
}