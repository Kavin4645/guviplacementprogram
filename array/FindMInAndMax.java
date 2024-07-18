package array;

import java.util.Arrays;

public class FindMInAndMax {

	public static void main(String[] args) {
		 int[] array = {5, 2, 8, 1, 9};
	        int[] result = findMaxMin(array);
	        System.out.println("Maximum: " + result[0] + ", Minimum: " + result[1]);
	    }

	    public static int[] findMaxMin(int[] array) {
	        int max = Arrays.stream(array).max().getAsInt();
	        int min = Arrays.stream(array).min().getAsInt();
	        return new int[]{max, min};
	    }
	}


