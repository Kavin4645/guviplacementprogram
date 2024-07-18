package array;

import java.util.Arrays;

public class RotateTheArray {

	public static void main(String[] args) {
		  int[] array = {1, 2, 3, 4, 5};
	        int k =4 ;
	        int[] rotatedArray = rotateArray(array, k);
	        System.out.println(Arrays.toString(rotatedArray)); 
	    }

	    public static int[] rotateArray(int[] array, int k) {
	        k = k % array.length;
	        int[] result = new int[array.length];
	        for (int i = 0; i < array.length; i++) {
	            result[(i + k) % array.length] = array[i];
	        }
	        return result;
	    }
	}




