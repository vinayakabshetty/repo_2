package javaProgramsToPractise;

public class InheritConstructor_SuperClass {
	
	public InheritConstructor_SuperClass() {
		System.out.println("Constructor from Super Class");
	}

	public static void display() {
		System.out.println("Display from Super Class");
	}

	final void PrintText(String str) {
		System.out.println(str);
	}

	final void PrintText(String str1, String str2) {
		System.out.println(str1 + " " + str2);
	}

	public static void main(String[] args) {
		System.out.println("Super class method");
		InheritConstructor_SuperClass obj = new InheritConstructor_SuperClass();
		obj.PrintText("Hello");
		obj.PrintText("Hello", "Buddy");
		
		Test();
		
	}

	private static final void Test() {
		System.out.println("Test");
	}
	
	static {
		System.out.println("Static block");
	}
	
	public void main() {
		System.out.println("Overloaded main method");
	}

}
