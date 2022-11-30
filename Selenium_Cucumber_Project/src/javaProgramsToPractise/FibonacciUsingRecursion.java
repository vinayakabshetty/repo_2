package javaProgramsToPractise;

public class FibonacciUsingRecursion {

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
		
		printSeries(numberOfSeries-2, x, y);
	}

	private static void printSeries(int numberOfSeries, int x, int y) {
		int sum;
		int firstNum = x;
		int secondNum = y;
		
		if(numberOfSeries > 0) {
			sum = firstNum+secondNum;
			System.out.print("\t"+sum);
			firstNum = secondNum;
			secondNum = sum;
			
			numberOfSeries = numberOfSeries - 1;
			printSeries(numberOfSeries, firstNum, secondNum);
		}
	}

}
