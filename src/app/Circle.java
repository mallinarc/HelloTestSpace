package app;

public class Circle {

	private int x, y;

	public Circle(int deltaX, int DeltaY) {
		this.x = deltaX;
		this.y = DeltaY;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
