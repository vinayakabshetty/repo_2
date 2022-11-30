package javaProgramsToPractise;

public class CopyOneArrayToAnother_NormalWay {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b;
		
		b = a.clone();
		
		for(int i:b) {
			System.out.println(i);
		}
		
		int[] c = {7, 8, 9};
		int[] d = new int[c.length];
		for(int j=0;j<c.length;j++) {
			d[j] = c[j];
		}
		
		for(int k:d) {
			System.out.println(k);
		}
	}

}
