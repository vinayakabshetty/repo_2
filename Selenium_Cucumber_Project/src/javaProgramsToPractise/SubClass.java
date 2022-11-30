package javaProgramsToPractise;

public class SubClass extends SuperClass {

	final static double pi = 3.14;
	
	public static void main(String[] args) {
		SuperClass supClass = new SubClass();
		supClass.method1("test");
		
		//pi = 4; cannot change final variable

	}

	void method1(String str) {
		System.out.println("Sub Class");
	}

	void method1(int num) {
		System.out.println("Sub Class");
	}

	// compiler error - cannot override
	/*
	 * void method2(String str) { System.out.println("Sub class final"); }
	 */

}
