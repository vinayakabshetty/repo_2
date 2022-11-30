package javaProgramsToPractise;

public class InheritConstructor_SubClass extends InheritConstructor_SuperClass {
	
	static int i;
	static InheritConstructor_SubClass obj;
	
	public static void main(String[] args) {
		System.out.println("Sub class method");

		InheritConstructor_SuperClass Obj = new InheritConstructor_SubClass();
		Obj.display();

	}

	// Trying to do constructor overriding but compiler treats it as new Method in
	// sub class and asks return type - Compiler error
	/*
	 * public InheritConstructor_SuperClass() {
	 * System.out.println("Constructor from Super Class"); }
	 */

	public static void display() {
		System.out.println("Display from Sub Class");
	}
}
