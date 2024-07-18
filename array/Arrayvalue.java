package array;

import java.util.Arrays;

public class Arrayvalue {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int value = 1;
		boolean result = containsValue(array, value);
		System.out.println(result);

	}

	public static boolean containsValue(int[] array, int value) {
		for (int num : array) {
	        if (num == value) {
	            return true;
	        }
	    }
	    return false;
	}


}
