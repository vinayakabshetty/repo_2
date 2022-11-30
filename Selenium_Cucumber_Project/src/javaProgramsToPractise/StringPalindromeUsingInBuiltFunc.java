package javaProgramsToPractise;

public class StringPalindromeUsingInBuiltFunc {

	public static void main(String[] args) {
		String str = "level";
		StringBuffer sbr = new StringBuffer(str);
		
		if (str.equalsIgnoreCase(sbr.reverse().toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
