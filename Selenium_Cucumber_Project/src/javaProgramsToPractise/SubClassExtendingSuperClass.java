package javaProgramsToPractise;

public class SubClassExtendingSuperClass extends FinalSuperClass {

	public static void main(String[] args) {
		System.out.println("Test final method");
		
		FinalSuperClass f = new FinalSuperClass();
		f.printInput();

		SubClassExtendingSuperClass sub = new SubClassExtendingSuperClass();
		sub.printInput();

		FinalSuperClass f2 = new SubClassExtendingSuperClass();
		f2.printInput();

		// Throws run time error, cannot cast super class to subclass
		{
			//SubClassExtendingSuperClass sub2 = (SubClassExtendingSuperClass) new FinalSuperClass();
			//sub2.printInput();
		}

		// Compiler error, cannot reference super class into sub class
		{
			//SubClassExtendingSuperClass sub3 = new FinalSuperClass();
		}
	}

	static void staticPrintInput() {
		System.out.println("Prints sub class method");
	}

	void printInput() {
		System.out.println("Prints sub class method");
	}

}