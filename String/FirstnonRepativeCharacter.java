package String;

import java.util.HashMap;
import java.util.Map;

public class FirstnonRepativeCharacter {

	public static void main(String[] args) {
		
		  String str = "book";
	        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
	        System.out.println("First Non-Repeated Character: " + firstNonRepeatedChar);
	}

	    public static char findFirstNonRepeatedChar(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }
	        for (char c : str.toCharArray()) {
	            if (charCountMap.get(c) == 1) {
	                return c;
	            }
	        }
	        return '\0'; 
	    }
	}
