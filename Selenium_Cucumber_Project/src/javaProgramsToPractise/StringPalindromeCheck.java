package javaProgramsToPractise;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		String str = "leveL";
		char c;
		String rev = "";
		
		for(int i=0;i<str.length();i++) {
			c = str.charAt(i);
			rev = c+rev;
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
