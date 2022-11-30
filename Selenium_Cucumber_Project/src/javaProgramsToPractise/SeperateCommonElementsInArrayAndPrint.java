package javaProgramsToPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeperateCommonElementsInArrayAndPrint {

	// a[] = {1,2,3,4,5} b[] = {3,5,6,7,8}
	// Separate common elements and store in c[] = {3,5}

	public static void main(String[] args) {

		// Declare arrays
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 3, 5, 6, 7, 8 };

		//List<int[]> al = Arrays.asList(a);
		//List<int[]> al2 = Arrays.asList(b);

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (int i1 : a) {
			al1.add(i1);
		}

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int i2 : b) {
			al2.add(i2);
		}

		System.out.println(al1.retainAll(al2));

		System.out.println(al1);

	}

}