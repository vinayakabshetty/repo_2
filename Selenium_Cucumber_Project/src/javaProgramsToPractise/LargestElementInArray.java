package javaProgramsToPractise;

import java.util.Arrays;
import java.util.Collections;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[] = {25, 11, 7, 75, 56};
		Arrays.sort(arr);
		System.out.println("Largest number in array is : "+arr[arr.length-1]);
		System.out.println("Smallest number in array is : "+arr[0]);
		
		
		int arr2[] = {25, 11, 7, 75, 56};
		for(int i=0;i<arr.length-1;i++) {
			if(arr2[i] > arr2[i+1]) {
				// Swap elements
				int temp = arr2[i];
				arr2[i] = arr2[i+1];
				arr2[i+1] = temp;
			}
		}		
		
		System.out.println("Largest number in array 2 is : "+arr[arr.length-1]);
		System.out.println("Smallest number in array 2 is : "+arr[0]);
		
		// Sort by descending order
		Integer arr3[] = {25, 11, 7, 75, 56};
		Arrays.sort(arr3, Collections.reverseOrder());
		
		
		System.out.println("Smallest number in array 3 is : "+arr[arr.length-1]);
		System.out.println("Largest number in array 3 is : "+arr[0]);
	}

}
