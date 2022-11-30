package javaProgramsToPractise;

import java.util.*;

public class SeperateCharactersInStringToNumberStringOrSpecialCharacter {

	// inputStr = "A1B@C2$%3"
	// Separate ABC 123 @$% into separate variables
	// Separate individual characters using String.charAt():char
	// Use Character.isDigit(), Character.isAplhabetic or else to check character
	// Use StringBuffer to append common characters	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		String inputStr = scanner.next();
		
		StringBuffer alphabets = new StringBuffer();
		StringBuffer numbers = new StringBuffer();
		StringBuffer specialChars = new StringBuffer();
		
		for(int i=0;i<inputStr.length();i++) {
			char character = inputStr.charAt(i);
			if (Character.isAlphabetic(character)){
				alphabets.append(character);
			} else if(Character.isDigit(character)) {
				numbers.append(character);
			} else {
				specialChars.append(character);
			}
		}
		
		System.out.printf("The alphabets in string %s is %s\n",inputStr, alphabets);
		System.out.printf("The numbers in string %s is %s\n",inputStr, numbers);
		System.out.printf("The special characters in string %s is %s\n",inputStr, specialChars);
		
		scanner.close();
	}

}
