package javaProgramsToPractise;

public class StringAppendProgram {

	public static void main(String[] args) {
		String s1 = new String("Buggy");
		//test(s1); // Interview Question : Non compatible arguments : Compiler error
		System.out.println(s1);
	}

	@SuppressWarnings("unused")
	private static void test(StringBuffer s){
		s.append("Bread");
	}
}
