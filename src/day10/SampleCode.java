package day10;

public class SampleCode {

public static void main(String args[]) {
	Sample sample = new Sample();
	// Test lengthOfLongestSubstring
    String s = "abcabcbb";
    System.out.println("Length of longest substring without repeating characters: " + sample.lengthOfLongestSubstring(s));

    // Test maxArea
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println("Maximum area: " + sample.maxArea(height));

    // Test maxProfit
    int[] prices = {7, 1, 5, 3, 6, 4};
    System.out.println("Maximum profit: " + sample.maxProfit(prices));

}
}
class Sample{
public int lengthOfLongestSubstring(String s) {
    int[] charIndex = new int[128]; // Assuming ASCII
    int maxLength = 0;
    int windowStart = 0;

    for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
        char rightChar = s.charAt(windowEnd);
        windowStart = Math.max(windowStart, charIndex[rightChar]);
        charIndex[rightChar] = windowEnd + 1;
        maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
    }

    return maxLength;
}

public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}
public int maxProfit(int[] prices) { 
	if (prices.length == 0) {
    return 0;
}
int minPrice = prices[0];
int maxProfit = 0;
for (int price : prices) {
    minPrice = Math.min(minPrice, price);
    maxProfit = Math.max(maxProfit, price - minPrice);
}
return maxProfit;
}

}