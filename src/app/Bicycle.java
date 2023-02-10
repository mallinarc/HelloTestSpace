package app;

import java.io.Serializable;

public class Bicycle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1542750922726904679L;

	public int cadence;
	private int gear;
	private int speed;

	public Bicycle(int startCadence, int startSpeed, int startGear) {

	}

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public int getCadence() {
		return this.cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public void decreaseSpeed(int decrement) {
		speed -= decrement;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gear;
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Bicycle other = (Bicycle) obj;
		if (gear != other.gear) return false;
		if (speed != other.speed) return false;
		return true;
	}

}
