package array;

import java.util.Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		double average = averageArray(array);
		System.out.println(average);

	}

	public static double averageArray(int[] array) {
		return Arrays.stream(array).average().getAsDouble();
	}

}
