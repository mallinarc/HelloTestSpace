package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalMain {

	@SuppressWarnings("unchecked")
	public static void main(String... args) {

		Dog dog1 = new Dog();
		dog1.setName("D1");
		dog1.setAge(1.5);

		Dog dog2 = new Dog();
		dog2.setName("D2");
		dog2.setAge(1.9);
		List<? super Dog> dogs = new ArrayList<>();
		dogs.add(dog1);
		dogs.add(dog2);

		List<? extends Animal> dogList = (List<? extends Animal>) dogs;
		List<Dog> dogLs = (List<Dog>) dogs;
		if (dogList.get(0) instanceof Dog) {
			System.out.println("....... dog 1:" + dogList.get(0).getName());
		}
		if (dogLs.get(0) instanceof Dog) {
			System.out.println("....... dog 1 name:" + dogList.get(0).getName());
		}
		/*
		 * dogLs.stream()
		 * .sorted((o1, o2) -> o1.getAge().compareTo(o2.getAge()) == 0 ? o1.getAge().compareTo(o2.getName()) :
		 * o1.getAge().compareTo(o2.getTailLength()))
		 * .filter(dog -> dog.getTailLength() >= tailLengh)
		 * .forEach(dog -> System.out.println(dog));
		 */

		Comparator<Dog> dogComp = Comparator.comparing(Dog::getAge).reversed();
		Collections.sort(dogLs, dogComp);
		dogLs.forEach(dog -> System.out.println(dog.getAge()));

		System.out.println("");
		Collections.sort(dogLs, Comparator.<Dog>comparingDouble(Dog::getAge).reversed());
		dogLs.forEach(dog -> System.out.println(dog.getAge()));

		System.out.println();
		dogLs.stream().forEach(dog -> System.out.println(dog.getAge()));
		System.out.println();

		List<Dog> dogsListToo = dogs.stream()
				.filter(Dog.class::isInstance)
				.map(Dog.class::cast)
				// .filter(sic -> sic.getAge() != sic.getAge())
				.collect(Collectors.toList());
		dogsListToo.forEach(dog -> System.out.println(dog.getAge()));

		/*
		 * dogList.sort(Comparator.comparing(e -> e));
		 * Comparator<Dog> dogComp = Comparator.comparing(Dog::getAge);
		 * Collections.sort(dogs, dogComp);
		 * List<? extends Dog> dogsList = dogs;
		 */
	}
}
