package javaProgramsToPractise;

import java.util.Arrays;
import java.util.Collections;

public class SortStringsAlphabetically {

	public static void main(String[] args) {
		Character[] arr = { 'Z', 'D', 'A', 'Q', 'P' };
		Arrays.sort(arr, Collections.reverseOrder());

		for (char c : arr) {
			System.out.println("Sorted char is : " + c);
		}
	}
}