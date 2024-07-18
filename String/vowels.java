package String;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		

		    Scanner sc =new Scanner (System.in);
	        String input = sc.nextLine();
	        System.out.println("Enter a value :");
	        int vowelCount = countVowels(input);
	        int consonantCount = countConsonants(input);
	        System.out.println("Vowel count: " + vowelCount);
	        System.out.println("Consonant count: " + consonantCount);
	    }

	    public static int countVowels(String str) {
	        return str.toLowerCase().replaceAll("[^aeiou]", "").length();
	    }

	    public static int countConsonants(String str) {
	        return str.toLowerCase().replaceAll("[^a-z]", "").replaceAll("[aeiou]", "").length();
	    }
	}

