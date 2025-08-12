/*  Write a function that reverses a string. 
 * The input string is given as an array of characters s.
 * You must do this by modifying the input array 
 * in-place with O(1) extra memory.
*/
package day8;

import java.util.Arrays;

public class LeetCode_Question344 {

	public static void main(String[] args) {
		char[] c = {'h','e','l','l','o'};
		RevString n = new RevString();
		n.reverseString(c);
		
		System.out.println(Arrays.toString(c));
	}

}
class RevString{
	public void reverseString(char[] s) {
        // Iterate from the beginning (i) and end (j) of the array towards the middle.
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            // Use a temporary variable (temp) to store the character at index i.
            char temp = s[i];

            // Replace the character at index i with the character at index j.
            s[i] = s[j];

            // Replace the character at index j with the character in the temporary variable (temp).
            s[j] = temp;
        } 
        // At this point, the character array 's' contains the reversed string.
    }
}
