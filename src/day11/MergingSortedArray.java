package day11;

import java.util.Arrays;

public class MergingSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {1, 3, 5, 7};
	        int[] arr2 = {2, 4, 6, 8};

	        int[] merged = mergeSortedArrays(arr1, arr2);
	        System.out.println(Arrays.toString(merged));
	    }

	    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
	        int[] merged = new int[arr1.length + arr2.length];
	        int i = 0, j = 0, k = 0;

	        // Merge smaller elements first
	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                merged[k++] = arr1[i++];
	            } else {
	                merged[k++] = arr2[j++];
	            }
	        }

	        // Copy remaining elements, if any
	        while (i < arr1.length) {
	            merged[k++] = arr1[i++];
	        }
	        while (j < arr2.length) {
	            merged[k++] = arr2[j++];
	        }

	        return merged;

	}

}
