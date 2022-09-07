package javaProgramsToPractise;

import java.util.Scanner;

public class LamdaExpressions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputFromUser = input.nextInt();
		
		if ((inputFromUser%2)==0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
		
		input.close();
	}
	
	/*
	 * (int n) -> { System.out.println("Entered number is : "+n); };
	 */

}
