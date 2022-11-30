package javaProgramsToPractise;

public class ConstructorTest {
	
	public ConstructorTest() {}

	public static void main(String[] args) {
		ConstructorTest obj = new ConstructorTest();
		obj.n();
	}
	
	void m(){
		System.out.println("m printing");
	}
	
	// Non static method
	void n(){
		System.out.println("n printing");
		m(); // Call to non static method
		o(); // Call to static method
		p();
	}
	
	static void o(){
		System.out.println("o printing");
		// m();
	}
	
	public static final void p(){
		System.out.println("p printing");
	}

}
