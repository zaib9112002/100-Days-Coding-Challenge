package day13;

public class question643 {
	 public static double findMaxAverage(int[] nums, int k) {
	        int n = nums.length;
	        double sum = 0;

	        // first k elements
	        for (int i = 0; i < k; i++) {
	            sum += nums[i];
	        }

	        double maxSum = sum;

	        // sliding window
	        for (int i = k; i < n; i++) {
	            sum += nums[i] - nums[i - k];
	            maxSum = Math.max(maxSum, sum);
	        }

	        return maxSum / k;
	    }

	    public static void main(String[] args) {
	        int[] nums = {10, 122, -5, -6, 50, 13};
	        int k = 4;
	        System.out.println("Maximum Average Subarray: " + findMaxAverage(nums, k));
	    }

}
