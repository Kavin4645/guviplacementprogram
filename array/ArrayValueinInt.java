package array;

public class ArrayValueinInt {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int value = 3;
		int index = indexOf(array, value);
		System.out.println(index); 
	}

	public static int indexOf(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
	        if (array[i] == value) {
	            return i;
	        }
	    }
	    return -1;
	}

	}


