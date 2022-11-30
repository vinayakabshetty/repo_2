package javaProgramsToPractise;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> duplicateSet = new HashSet<Integer>();
		int temp;
		boolean status;
		int count = 0;
		
		int[] arr ={1, 2, 8, 3, 2, 5, 2, 5, 1 };
		
		for(int i=0;i<arr.length;i++) {
			temp = arr[i];
			status = hs.add(temp);
			if (status == false) {
				duplicateSet.add(temp);
			}
		}
		
		System.out.println(duplicateSet);
	}

}
