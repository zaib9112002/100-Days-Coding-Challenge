package dayFour;

public class SecondLarge {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            // Handle cases where the array is too small or null
            // You might want to throw an exception or return a specific error code
            return -1; // Or throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        // Handle cases where all elements are the same (no distinct second largest)
        if (secondLargest == Integer.MIN_VALUE) {
            // This means either all elements were the same, or the array had only one distinct element.
            // In such cases, there isn't a *distinct* second largest.
            // You might return -1 or handle as per your requirement.
            return -1; 
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 8, 20, 15};
        System.out.println("Second largest in arr1: " + findSecondLargest(arr1)); // Expected: 15

        int[] arr2 = {5, 5, 5, 5};
        System.out.println("Second largest in arr2: " + findSecondLargest(arr2)); // Expected: -1 (or error)

        int[] arr3 = {7, 7, 10, 10};
        System.out.println("Second largest in arr3: " + findSecondLargest(arr3)); // Expected: 7

        int[] arr4 = {1};
        System.out.println("Second largest in arr4: " + findSecondLargest(arr4)); // Expected: -1 (or error)
    }
}