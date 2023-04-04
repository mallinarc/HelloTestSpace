package app;

public class Lmbdas {

	public static void main(String[] args) {

		Cat myCat = new Cat();
		myCat.print();
		printThing(myCat);

		// Dog myDog = new Dog();
		// does not work as the Dog class does not implement Printable interface
		// printThing(myDog);

	}

	public static void printThing(Printable thing) {
		thing.print();
	}

}
