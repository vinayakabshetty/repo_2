package javaProgramsToPractise;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if((num%2)==0) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not an Prime number");
		}
		
		input.close();
	}

}
