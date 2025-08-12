/* Given an integer array nums,
 *  move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *  Note that you must do this in-place without making a copy of the array.
 */
package day8;

import java.util.Arrays;

public class LeetCode_Question283 {

	public static void main(String[] args) {

		int[] nums = {0,14,0,12,21,0};
	    int left = 0; //to keep track position

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {	//check for non zero elements
                int temp = nums[right];  //nonzero means swap it with index left
                nums[right] = nums[left];
                nums[left] = temp;
                left++; //increment pointer to take next position
            }
            
        }
        System.out.println(Arrays.toString(nums));
    }
}