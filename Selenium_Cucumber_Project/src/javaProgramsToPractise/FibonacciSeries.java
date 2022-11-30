package javaProgramsToPractise;

public class FibonacciSeries {
	
	// print 0 1 1 2 3 5 8

	public static void main(String[] args) {
		
		int numberOfSeries = 7;
		int x = 0;
		int y = 1;
		int sum;
		
		if(numberOfSeries >=2) {
			System.out.print(x+"\t"+y);
		} else {
			System.out.print("Fibonacci series must contain length more than 2, EXIT!!");
		}
		
		for(int i=3;i<=numberOfSeries;i++) {
			sum = x+y;
			System.out.print("\t"+sum);
			x = y;
			y = sum;		
		}
	}

}
