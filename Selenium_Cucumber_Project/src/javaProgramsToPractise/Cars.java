package javaProgramsToPractise;

public interface Cars {
	
	int x = 10;
	
	abstract void start();
	
	default void end() {
		System.out.println("Since Java 8, we can have default and static methods in an interface");
	};
	
	public static int run() {
		System.out.println("Since Java 8, we can have static methods in an interface");
		return 1;
	};
	
	static int fire() {
		System.out.println("Since Java 8, we can have static methods in an interface");
		System.out.println(x);
		return 1;
	};
	
	private void test() {
		System.out.println("Simply testing");
	}
}