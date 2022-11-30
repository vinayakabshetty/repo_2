package javaProgramsToPractise;

public class AccessModifierClass {
	
	public int x;
	
	private AccessModifierClass() {
		System.out.println("I am inside private constructor");
	}

	public static void main(String[] args) {
		AccessModifierClass obj = new AccessModifierClass();
	}

}
