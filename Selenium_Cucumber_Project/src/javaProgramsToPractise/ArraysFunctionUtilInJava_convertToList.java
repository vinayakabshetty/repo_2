package javaProgramsToPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysFunctionUtilInJava_convertToList {

	public static void main(String[] args) {
		String[] array = { "a", "b", "c", "d", "e" };

		// Method 1
		List<String> list = Arrays.asList(array);
		System.out.println(list);

		// Method 2
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, array);
		System.out.println(list1);
		
		int[] array2 = { 1, 2, 3 };

		// Method 1
		//List<Integer> list3 = Arrays.asList(array2);
		//System.out.println(list3);

		// Method 2
		List<String> list4 = new ArrayList<String>();
		//Collections.addAll(list4, array2);
		System.out.println(list4);
		

	}

}