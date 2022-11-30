package javaProgramsToPractise;

import java.util.HashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		Object[] newArr;

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		
		newArr = hs.toArray();
		
		for (Object x : newArr) {
			System.out.println(x);
		}

	}

}
