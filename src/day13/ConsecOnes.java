package day13;

//question 485
public class ConsecOnes {
  public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,10,12,1,11,1,22,1, 1, 0, 3, 1, 1};
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums));
    } //counts  consecutives ones and prints as 2
}
