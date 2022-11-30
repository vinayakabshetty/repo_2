package javaProgramsToPractise;

import java.util.HashMap;

public class FreqOfElementsInArray {

	public static void main(String[] args) {
		int[] arr ={1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int temp;
		int count=0;
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			temp = arr[i];
			for(int j=0;j<arr.length;j++) {
				if(temp == arr[j]) {
					count = count+1;
				}
			}
			mp.put(temp, count);		
			count = 0;
		}
		
		//System.out.printf("The %d number repeated %d times\n", temp, count);
		System.out.println(mp);

	}

}
