package array;

import java.util.Arrays;

public class MergeTwoSArray {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        
        int[] concatenatedArray = concatenateArrays(array1, array2);
        
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        
        int[] concatenatedArray = new int[length1 + length2];
        
        System.arraycopy(array1, 0, concatenatedArray, 0, length1);
        System.arraycopy(array2, 0, concatenatedArray, length1, length2);
        
        return concatenatedArray;
    }
}
