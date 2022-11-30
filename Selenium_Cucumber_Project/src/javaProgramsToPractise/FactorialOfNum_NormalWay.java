package javaProgramsToPractise;

import java.util.Scanner;

public class FactorialOfNum_NormalWay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 1;
		
		for(int i=num;i>=1;i--) {
			sum = sum*i;
		}
		
		System.out.printf("Factorial of number %d is %d", num, sum);
		
		input.close();
	}

}
