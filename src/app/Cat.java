package app;

public class Cat extends Animal implements Printable {
	private String color;

	public Cat() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}

	@Override
	public void print() {
		System.out.println("Meow");
	}
}
