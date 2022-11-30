package javaProgramsToPractise;

public abstract class Animal {
	
	static int x = 10;
	int y = 20;
	
	private Animal() {
		
	}

	public final void eat() {
		System.out.println("Animal is eating");
	}

	public abstract void makeSound();

	public static void main(String[] args) {
		// Animal animal = new Animal();
		System.out.println(x);
	}
}
