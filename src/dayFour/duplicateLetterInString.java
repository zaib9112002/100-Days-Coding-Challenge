package dayFour;

import java.util.LinkedHashMap;
import java.util.Map;

public class duplicateLetterInString {
	
	public static void main(String[] args) {
		String input = "programming";
    input = input.toLowerCase();
    
    Map<Character, Integer> freq = new LinkedHashMap<>();
    // Count frequency of each character
    for (char ch : input.toCharArray()) {
        if (Character.isLetter(ch)) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
    }
    System.out.print("Duplicate letters: ");
    // Print letters with frequency > 1
    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.print(entry.getKey() + " ");
        }
    }
}
}
