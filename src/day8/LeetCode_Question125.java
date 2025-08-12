// two pointer technique
package day8;


public class LeetCode_Question125 {

	public static void main(String[] args) {
		String s = "Hello";
		if(isPalindrome(s)) {
		System.out.println("Yes String is Palindrome");
		}else {
		System.out.println("No String is not Palindrome");
		}
	}


public static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
        left++;
        right--;
    }
    return true;
}
}