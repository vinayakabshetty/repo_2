package javaProgramsToPractise;

public class SubClass_StaticEntityOverrideAttempt extends SuperClass_StaticEntity {

	public static void main(String[] args) {
		SuperClass_StaticEntity obj = new SubClass_StaticEntityOverrideAttempt();
		obj.a();
	}

	void a() {
		System.out.println("I am using method a from sub class");
	}
	
}