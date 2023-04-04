package app;

public class Dog extends Animal {
	private double age;

	public Dog() {
		super();
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public void makeNoise() {
		System.out.println("Woof Woof");
	}

	public void growl() {
		System.out.println("Grrrrrrrr");
	}
}
