package dayFive;
import java.util.Arrays;

public class dayFive  {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Task 1: Insert a new element x at a given index y
        int x = 11;
        int y = 3;
        array = insertElement(array, x, y);
        System.out.println("After inserting " + x + " at index " + y + ": " + Arrays.toString(array));

        // Task 2: Delete an element from a given index i
        int i = 5;
        array = deleteElement(array, i);
        System.out.println("After deleting element at index " + i + ": " + Arrays.toString(array));

        // Task 3: Perform a right rotation of elements n times
        int n = 2;
        array = rightRotate(array, n);
        System.out.println("After right rotating " + n + " times: " + Arrays.toString(array));

        // Task 4: Perform a left rotation of elements n times
        n = 3;
        array = leftRotate(array, n);
        System.out.println("After left rotating " + n + " times: " + Arrays.toString(array));
    }

    // Method to insert an element at a given index
    public static int[] insertElement(int[] array, int x, int y) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, y);
        newArray[y] = x;
        System.arraycopy(array, y, newArray, y + 1, array.length - y);
        return newArray;
    }

    // Method to delete an element at a given index
    public static int[] deleteElement(int[] array, int i) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, i);
        System.arraycopy(array, i + 1, newArray, i, array.length - i - 1);
        return newArray;
    }

    // Method to perform a right rotation
    public static int[] rightRotate(int[] array, int n) {
        n = n % array.length;
        int[] newArray = new int[array.length];
        System.arraycopy(array, array.length - n, newArray, 0, n);
        System.arraycopy(array, 0, newArray, n, array.length - n);
        return newArray;
    }

    // Method to perform a left rotation
    public static int[] leftRotate(int[] array, int n) {
        n = n % array.length;
        int[] newArray = new int[array.length];
        System.arraycopy(array, n, newArray, 0, array.length - n);
        System.arraycopy(array, 0, newArray, array.length - n, n);
        return newArray;
    }
}