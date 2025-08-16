package day12;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicatesString {

	 public static String removeDuplicateCharacters(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        Set<Character> uniqueChars = new LinkedHashSet<>();
	        for (char c : str.toCharArray()) {
	            uniqueChars.add(c);
	        }

	        StringBuilder resultBuilder = new StringBuilder();
	        for (char c : uniqueChars) {
	            resultBuilder.append(c);
	        }

	        return resultBuilder.toString();
	    }

	    public static void main(String[] args) {
	        String originalString = "Malayalam";
	        String uniqueString = removeDuplicateCharacters(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("String without duplicates: " + uniqueString); // Output: Malym

	      }
}
