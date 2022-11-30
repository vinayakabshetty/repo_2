package javaProgramsToPractise;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		String[] array = { "a", "b", "c", "d", "e" };
		
		Scanner inputFromConsole = new Scanner(System.in);
		int numberOfRotations = inputFromConsole.nextInt();
		
		System.out.printf("User entered input to rotate array %d times",numberOfRotations);
		System.out.println();

		System.out.println("Before rotation");
		for (String x : array) {
			System.out.println(x);
		}

		System.out.println("================================");

		
		String temp;
		for (int i = 0; i < numberOfRotations; i++) {
			temp = array[(array.length) - 1];
			for (int j = array.length - 1; j >= 1; j--) {
				array[j] = array[j - 1];
			}
			array[0] = temp;
		}

		System.out.printf("After rotation %d times",numberOfRotations);
		System.out.println();
		
		for (String x : array) {
			System.out.println(x);
		}
		
		inputFromConsole.close();
	}

}