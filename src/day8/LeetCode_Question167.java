package day8;

import java.util.Arrays;

public class LeetCode_Question167 {
	
	public static void main(String[] args) {

		int[] array = {2,7,5,11,15}; // input array should be sorted array
		int target = 7; 			// enter the sum of any 2 numbers 
 		TwoAdd ta = new TwoAdd();
		int[] arr = ta.add(array, target);
// The sum of 2 and 5 is 9. Therefore, index1 = 1, index2 = 3. We return [1, 3].
		System.out.println(Arrays.toString(arr)); 
		
	}
}
class TwoAdd {
	public int[] add(int[] numbers ,int target)
	{			int left = 0;
		    int right = numbers.length - 1;
		
		    while (left < right) {
		        int total = numbers[left] + numbers[right];
		
		        if (total == target) {
		            return new int[]{left + 1, right + 1};
		        } else if (total > target) {
		            right--;
		        } else {
		            left++;
		        }
		    }
		    return new int[]{-1, -1}; 

}
}