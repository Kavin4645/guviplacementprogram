package array;

import java.util.Arrays;

public class ArrayRevers {

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(array);
        System.out.println(Arrays.toString(reversedArray)); 
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }
}
