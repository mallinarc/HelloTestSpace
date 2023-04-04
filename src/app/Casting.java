package app;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Dog();
		myAnimal.makeNoise();
		/*
		 * below line of code complain as
		 * Dog object is upcast to Animal and
		 * Animal does not know about the growl method in dog
		 */
		// myAnimal.growl();

		doAnimalStuff(myAnimal);

	}

	public static void doAnimalStuff(Animal animal) {
		animal.makeNoise();
	}

}
