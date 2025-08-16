package day13;
//question 487
public class findMaxConsecOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
        int left = 0, right = 0, zeroCount = 0, maxLen = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0};
        System.out.println("Max Consecutive Ones II: " + findMaxConsecutiveOnes(nums));
    }	//prints number of ones in a list i,e.,4
}
