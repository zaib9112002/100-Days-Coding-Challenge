package day12;

import java.util.HashSet;

public class RemovingDuplicatesString {

	 public static String removeDuplicates(String str) {
	        StringBuilder sb = new StringBuilder();
	        HashSet<Character> seen = new HashSet<>();

	        for (char ch : str.toCharArray()) {
	            if (!seen.contains(ch)) {
	                seen.add(ch);
	                sb.append(ch);
	            }
	        }
	        return sb.toString();
	    }
	    public static void main(String[] args) {
	        String originalString = "Malayalam";
	        String uniqueString = removeDuplicates(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("String without duplicates: " + uniqueString); // Output: Malym

	      }
}
