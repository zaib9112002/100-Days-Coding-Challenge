package day8;
public class LeetCode_Question26 {
	public static void main(String[] args) {
		int[] arr= {1,2,23,10,1}; //sorted array
		System.out.println("Duplicate element is at position "+removeDuplicates(arr));
		}
	public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) return 0;
	        int index = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[index++] = nums[i];
	            }
	        }
	        return index;
	}

}
