package javaProgramsToPractise;

public class FinalSuperClass {

	public static void main(String[] args) {
		System.out.println("Test final method");
		
		FinalSuperClass f = new FinalSuperClass();
		f.printInput();
		
		staticPrintInput();
	}

	void printInput() {
		System.out.println("Prints super class method");
	}
	
	static void staticPrintInput() {
		System.out.println("Prints super class method");
	}
}
