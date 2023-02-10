package app;

public class TestBikeInheritance {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25);
		if (mb instanceof Bicycle) {

			System.out.println(mb.getClass().getSimpleName());
			System.out.println(mb.toString());
		}

	}

}
