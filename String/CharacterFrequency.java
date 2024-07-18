package String;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static void main(String[] args) {
	        String str = "aabbccdd";
	        Map<Character, Integer> freqMap = characterFrequency(str);
	        System.out.println("Character Frequency:");
	        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public static Map<Character, Integer> characterFrequency(String str) {
	        Map<Character, Integer> freqMap = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
	        }
	        return freqMap;
	    }
	}


	
