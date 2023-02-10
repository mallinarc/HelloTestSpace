package app;

public class TestPassByValue {

	public static void main(String... args) {
		System.out.println("inside TestReferenceByValue.");
		int x = 5;
		change(x); // makes a copy of x and passes that value.
		System.out.println("x:" + x);// should not change x from being
	}

	public static void change(int x) {
		x = 10;
	}
}
