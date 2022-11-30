package javaProgramsToPractise;

public class Palindrome {

	public static void main(String[] args) {
		int n = 123;
		int temp = n;
		int sum = 0;
		int r;

		while (n > 0) {
			r = n % 10;
			System.out.println("r is " + r);
			sum = (sum * 10) + r;
			System.out.println("Sum is " + sum);
			n = n / 10;
			System.out.println("Num is " + n);
		}

		if (temp == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not an Palindrome");
		}
	}

}
