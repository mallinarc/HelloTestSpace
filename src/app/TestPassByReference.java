package app;

// A Java program to show that references are also passed
// by value.
public class TestPassByReference {

	int x;

	TestPassByReference(int i) {
		x = i;
	}

	TestPassByReference() {
		x = 0;
	}
}