package javaProgramsToPractise;

import java.util.Scanner;

public class FactorialOfANumber {

	// 5! = 5*4*3*2*1
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int sum = fact(num);
		System.out.printf("The factorial of number %d is %d", num, sum);
		
		input.close();
	}
	
	static int fact(int n) {
		int factSum = n;
		
		if(n==0) {
			return 1;
		}
		
		if(n>1) {
			factSum = factSum * fact(n-1);
		}
		
		return factSum;
		
	}

}
