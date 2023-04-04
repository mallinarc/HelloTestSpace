package app;

public abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("I am just an animal.");
	}

}
