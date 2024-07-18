package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		int length = lengthOfLongestSubstring(str);
		System.out.println("Length of longest substring without repeating characters: " + length);
	}

	public static int lengthOfLongestSubstring(String str) {
		int n = str.length();
		int res = 0;
		int i = 0, j = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (i < n && j < n) {
			if (map.containsKey(str.charAt(j))) {
				i = Math.max(i, map.get(str.charAt(j)) + 1);
			}
			map.put(str.charAt(j), j);
			res = Math.max(res, j - i + 1);
			j++;
		}
		return res;
	}
}
