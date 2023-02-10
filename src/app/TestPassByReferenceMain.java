package app;

public class TestPassByReferenceMain {
	public static void main(String... args) {
		// t is a reference
		TestPassByReference t = new TestPassByReference(5);

		// Reference is passed and a copy of reference
		// is created in change()
		change(t);

		// Old value of t.x is printed
		System.out.println("...t.x:" + t.x);
	}

	public static void change(TestPassByReference ts) {
		// We changed reference to refer some other location
		// now any changes made to reference are not reflected
		// back in main
		ts = new TestPassByReference();
		ts.x = 10;
		System.out.println("...... ts.x:" + ts.x);
	}
}
