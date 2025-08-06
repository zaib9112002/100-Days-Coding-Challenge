package dayThree;

public class BubbleSort {

    public static void main(String[] args) {
    	 int[] arr = {6, 3, 4, 5, 2};
         int n = arr.length;
         bubbleSort(arr, n);
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
     }

     // Recursive Bubble Sort
     public static void bubbleSort(int[] arr, int n) {
         // Base case: if array size is 1, return
         if (n == 1) {
             return;
         }

         // One pass of bubble sort: move largest element to end
         for (int i = 0; i < n - 1; i++) {
             if (arr[i] > arr[i + 1]) {
                 // swap arr[i] and arr[i+1]
                 int temp = arr[i];
                 arr[i] = arr[i + 1];
                 arr[i + 1] = temp;
             }
         }

         // Recur for remaining array
         bubbleSort(arr, n - 1);
     }
 }
