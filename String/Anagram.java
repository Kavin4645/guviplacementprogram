package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen"; 
        String str2 = "silent"; 
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are anagrams: " + isAnagram);
    } 
	
	public static boolean areAnagrams(String str1,String str2) {
		if (str1.length()!=str2.length()) {
			return false;
		}
		char[]chars1=str1.toLowerCase().toCharArray();
		char[]chars2=str2.toLowerCase().toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return Arrays.equals(chars1, chars2);
	}
}
	


