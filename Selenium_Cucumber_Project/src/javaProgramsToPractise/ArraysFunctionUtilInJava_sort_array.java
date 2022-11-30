package javaProgramsToPractise;

import java.util.Arrays;

public class ArraysFunctionUtilInJava_sort_array {

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 2, 9 };
		display(a);

		System.out.println("After sorting");
		Arrays.sort(a);
		display(a);
	}

	private static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
