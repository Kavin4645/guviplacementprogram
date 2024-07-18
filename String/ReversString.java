package String;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String input =sc.nextLine();
		String output=rv(input);
		System.out.println("The Revers String is:"  + output);
	}
        public static String rv(String str) {
			String output="";
			for (int i = 0; i < str.length(); i++) {
				output=str.charAt(i)+output;
			}
        	return output;
        	
			
		}
		
		

	}


